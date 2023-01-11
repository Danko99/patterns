package creational.object_pull;

public class ObjectPoolClient {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.getPooledObject();
        objectPool.getPooledObject();
        objectPool.getPooledObject();

    }
}
