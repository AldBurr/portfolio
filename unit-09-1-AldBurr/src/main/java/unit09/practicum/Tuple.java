package unit09.practicum;

public interface Tuple<E> extends Iterable<E>
{
    public E get(int index);
    public int size();
}
