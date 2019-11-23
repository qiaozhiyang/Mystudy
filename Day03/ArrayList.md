##ArrayList
我们想存储对象数据，选择的容器，只有对象数组。而数组的长度是固定的，无法适应数据变化的需求。为了解决这个问题，Java提供了另一个容器java.util.ArrayList 集合类,让我们可以更便捷的存储和操作对象数据。
ArrayList 中可不断添加元素，其大小也自动增长。

#arrayList常用增删查改方法：
public boolean add(E e)
参数 E e，在构造ArayList对象时，<E> 指定了用什么数据类型，那么add（E e）方法中，只能添加什么数据类型的对象；

public boolean add(E e):将指定的元素添加到此集合的尾部；

public E remove(int index):移除此集合中指定位置上的元素，返回被删除的元素。

public E get（int index）：返回此集合中指定位置上的元素，返回获取的元素；

 public int size（）：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。