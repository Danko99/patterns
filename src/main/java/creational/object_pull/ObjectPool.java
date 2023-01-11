package creational.object_pull;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    private List<PooledObject> free;
    private List<PooledObject> used;

    public ObjectPool() {
        free = new ArrayList<>();
        used = new ArrayList<>();
    }

    public PooledObject getPooledObject() {
        if (free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        }

        PooledObject pooledObject = free.get(0);
        free.remove(pooledObject);
        used.add(pooledObject);

        return pooledObject;
    }

}
