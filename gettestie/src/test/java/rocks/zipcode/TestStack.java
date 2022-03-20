package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestHashSet() {
        HashSet<String> hashTest = new HashSet<>();
        hashTest.add("bob");
        hashTest.add("steve");
        hashTest.add("steve");
        hashTest.add("luke");
        hashTest.add("will");
        hashTest.remove("steve");
        Iterator<String> it = hashTest.iterator();
        while(it.hasNext() ) {
            System.out.println(it.next() + " ");
        }
        Assert.assertTrue(hashTest.contains("bob"));
        Assert.assertEquals(hashTest.size(),3);

    }

    @Test
    public void TestArrayList() {
        ArrayList<Integer> testArr = new ArrayList();//grows capacity by 50%
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.remove(2);
        Assert.assertEquals(testArr.size(),2);
        Assert.assertTrue(testArr.contains(2));
        Assert.assertFalse(testArr.contains(3));
    }
    @Test
    public void TestHashMap() {
        Map<String, Integer> testHash = new HashMap<>();
        testHash.put("a", 1);
        testHash.put("b", 2);
        testHash.put("c", 3);
        testHash.remove("b",2);
        System.out.println(testHash.keySet());
        Assert.assertTrue(testHash.containsKey("c"));
        Assert.assertTrue(testHash.get("a")== 1);

    }
    @Test
    public void TestLinkList() {
        LinkedList<String> testLink = new LinkedList<>();
        testLink.add("a");
        testLink.add("b");
        testLink.add("c");
        testLink.add("d");
        testLink.add("b");
        testLink.add("a");
        testLink.add(1,"a is for apple");
        System.out.println(testLink);//add string in second spot
        testLink.addLast("z");
        System.out.println(testLink);
        System.out.println((testLink.lastIndexOf("b")));
        System.out.println(testLink);
        System.out.println(testLink.peekLast());
        System.out.println(testLink);
        testLink.removeFirstOccurrence("a");
        System.out.println(testLink);
        testLink.push("pop this");
        System.out.println(testLink);
        testLink.pop();
        System.out.println(testLink);
    }
    @Test
    public void ArrayDeque () {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        ArrayList<Integer> col = new ArrayList<>(Arrays.asList(10,20,30,40));
        numbers.addAll(col);
        System.out.println(numbers);

        ArrayDeque<Integer> cloneNumbers = numbers.clone();
        System.out.println(cloneNumbers);
        cloneNumbers.clear();
        System.out.println(cloneNumbers);
        System.out.println(cloneNumbers.isEmpty());
        System.out.println(numbers);

        Iterator value = numbers.iterator();
        System.out.println("The iterator values are: ");
        while(value.hasNext()) {
            System.out.println(value.next());
        }
        System.out.println(numbers.poll()); // returns head method and removes it
        System.out.println(numbers);
        numbers.forEach((n -> System.out.println(n)));
    }
    @Test
    public void Vector() {
        Vector<Integer> v = new Vector();
        v.add(1);
        v.add(2);
        System.out.println(v.capacity()); //capacity is 10, if exceeds, grows capacity 100%, capacity is unique to vector, thread safe,slow compared to arraylist
        v.add(2);
        v.add(7);
        v.add(2);
        v.add(35);
        v.add(25);
        v.add(15);
        v.add(62);
        v.add(27);
        v.add(2);
        v.remove(1); // removes first 2
        for(int i : v){
            System.out.println(i);
        }
        System.out.println(v.capacity());
    }
    @Test
    public void TreeMap() {
        TreeMap<Integer, String> numAbc = new TreeMap<>();
        numAbc.put(26, "a");
        numAbc.put(25, "b");
        numAbc.put(24, "c");
        System.out.println(numAbc);
        System.out.println(numAbc.containsKey(24));
        System.out.println(numAbc.entrySet());// prints the set of the map
        System.out.println(numAbc.keySet());//only returns keys
        TreeMap<Integer, String> numFruit= new TreeMap<>();
        numFruit.put(1, "apple");
        numFruit.put(2, "banana");
        numFruit.put(3, "carrot");
        numAbc.putAll(numFruit);
        System.out.println(numAbc);//add all of this map to numAbc
        System.out.println(numAbc.size());//returns number of elements
        System.out.println(numAbc.subMap(1,24));//from first element to give element not including
        System.out.println(numAbc.values());//returns only values.

    }
}
