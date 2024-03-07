package com.java.Aug_24_2023.HasMap;

import java.util.*;

/**
 * create by  mohd salman
 * Date : 13/11/23
 * Time : 2:06 pm
 * Project_Name : java_core
 */
class MyHashMap<K, V> {
    private  static final int DEFAULT_CAPACITY = 4;
    private static final float LOAD_FACTOR = 0.75F;
    private int Size = 0;
    private LinkedList<Node>[] Buckets;

    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        CreateBuckets(DEFAULT_CAPACITY);
    }

    public void put(K key, V value) {
        int BucketIndex = CreateHashingIndex(key);
        LinkedList<Node> bucket = Buckets[BucketIndex];
        int findIndex = SearchNode(key, bucket);
        if (findIndex == -1) {
            Node node = new Node(key, value);
            bucket.add(node);
            Size++;
        } else {
            bucket.get(findIndex).value = value;
        }
        if (Size > LOAD_FACTOR * Buckets.length) {
            ReHashing();
        }
    }

    private void ReHashing() {
        Size = 0;
        LinkedList<Node>[] old_buckets = Buckets;
        CreateBuckets((Buckets.length * 3 / 2) + 1);
        for (var bucket : old_buckets) {
            for (var node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    private int SearchNode(K key, LinkedList<Node> bucket) {
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }

    public V get(K key) {
        int BI = CreateHashingIndex(key);
        LinkedList<Node> bucket = Buckets[BI];
        int findNode = SearchNode(key, bucket);
        if (findNode == -1) {
            return null;
        }
        return bucket.get(findNode).value;
    }


    public V Remove(K key) {
        int BI = CreateHashingIndex(key);
        LinkedList<Node> buket = Buckets[BI];
        int FindingNode = SearchNode(key, buket);
        if (FindingNode > -1) {
            Node node = buket.get(FindingNode);
            V value = node.value;
            buket.remove(FindingNode);
            Size--;
            return value;
        }
        return null;

    }

    public int Capacity() {
        return (int) (LOAD_FACTOR * (float) Buckets.length);

    }

    public int Size() {
        return Size;
    }

    private int CreateHashingIndex(K key) {
        return (Math.abs(key.hashCode()) % Buckets.length);
    }

    private void CreateBuckets(int defaultCapacity) {
        try {
            Buckets = new LinkedList[defaultCapacity];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < defaultCapacity; i++) {
            Buckets[i] = new LinkedList<>();
        }
    }
}



class HasMapImplement {
    public static void main(String[] args) {
        MyHashMap<Integer, String> object = new MyHashMap<>();
        MyHashMap<String,Integer>o=new MyHashMap<>();
        object.put(1, "salman");
        object.put(2, "Imran");
        object.put(3, "Shahil");
        object.put(4, "jubair");
        object.put(5, "faizan");
        o.put("salman",433);
        System.out.println(object.Capacity());
        System.out.println(object.Size());
        System.out.println(object.get(3));
        System.out.println(object.Remove(4));
        System.out.println(object.get(4));

        System.out.println(object.Size());
        System.out.println(object.Capacity());


    }
}