
public class MyMapNode<K, V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {...}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;

	}

	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {...}
}

