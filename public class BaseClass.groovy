public class BaseClass
{
    protected int _value;

    public BaseClass(int value)
    {
        _value = value;
    }

    public virtual void PrintValue()
    {
        Console.WriteLine($"Base class value: {_value}");
    }

    public virtual int GetValue()
    {
        return _value;
    }
}
public class DerivedClass : BaseClass
{
    public DerivedClass(int value) : base(value)
    {
    }

    public override void PrintValue()
    {
        Console.WriteLine($"Derived class value: {_value}");
    }

    public new int GetValue()
    {
        return _value * 2;
    }
}
class Program
class Program
{
    static void Main(string[] args)
    {
        
        BaseClass baseObj = new BaseClass(10);
        baseObj.PrintValue(); // Выведет: Base class value: 10
        Console.WriteLine($"Base class value: {baseObj.GetValue()}"); // Выведет: Base class value: 10

        // Создаем объект производного класса
        DerivedClass derivedObj = new DerivedClass(20);
        derivedObj.PrintValue(); // Выведет: Derived class value: 20
        Console.WriteLine($"Derived class value: {derivedObj.GetValue()}"); // Выведет: Derived class value: 40

        // Используем базовый класс, но вызываем методы производного
        BaseClass baseRef = new DerivedClass(30);
        baseRef.PrintValue(); // Выведет: Derived class value: 30
        Console.WriteLine($"Derived class value: {baseRef.GetValue()}"); // Выведет: Base class value: 30
    }
}
