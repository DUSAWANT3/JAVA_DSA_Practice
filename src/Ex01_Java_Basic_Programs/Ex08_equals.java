package Ex01_Java_Basic_Programs;

public class Ex08_equals {
    public static void main(String[] args) {
           //🔁 == vs .equals() in Java
//✅ == (Reference Comparison)
        //Compares memory addresses (i.e. if two references point to the exact same object in memory).
        //Used for primitive types and object references.

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);  // false, because a and b are different objects

        String c = "Hi"; // "Hi" is placed in the String pool
        String d = "Hi";// Java sees "Hi" already exists in the pool, so it reuses the same reference
                        // so d pointing to c
        System.out.println(c==d); //true c&d both point to the same object in memory

//✅ .equals() (Content Comparison)
        //Defined in the Object class and often overridden by Java classes like String, List, etc.
        //Compares the contents or logical equality of two objects.
        System.out.println(a.equals(b));  // true, because the content "hello" is the same

        //== checks if both variables point to the same physical book.
        //.equals() checks if the content inside the books is the same, even if they’re different physical copies.

 //✅ Another Example:
        Integer x = Integer.valueOf(200);
        Integer y = Integer.valueOf(200);

        System.out.println(x == y);      // false - different objects
        System.out.println(x.equals(y)); // true  - same value

//🔄 Interview Insight:
//Always use .equals() when comparing object values like String, Integer, List, etc.
// Use == only when you intentionally want to check if two references point to the exact same object.

        int p =20;
        int q =20;
        System.out.println(p==q); //true compares values
        //System.out.println(p.equals(q)); /// ❌ Error! error: int cannot be dereferenced
       //✅ Primitives like int, float, char, etc., do not have methods, including .equals().
    }
}
