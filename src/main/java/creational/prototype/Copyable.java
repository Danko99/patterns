package creational.prototype;

public interface Copyable extends Cloneable{
    Object copy() throws CloneNotSupportedException;
}
