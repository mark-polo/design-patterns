package com.patterns.ObjectPool;

import java.util.LinkedList;
import java.util.List;

public class ObjectPoolLesson {
    public static void main(String [] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.releasePoolObject(pooledObject);

    }
}

class PooledObject {}

class ObjectPool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();


     public PooledObject getPooledObject() {
        if(free.isEmpty()) {
            // If not free obj we just create it
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }
     }

     public void releasePoolObject (PooledObject pooledObject) {
        used.remove(pooledObject);
        free.add(pooledObject);
     }
}