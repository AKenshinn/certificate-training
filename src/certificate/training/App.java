package certificate.training;

import certificate.training.java809.question006.Customer;
import certificate.training.java809.question010.Foo;
import certificate.training.java809.question043.Emp43;
import certificate.training.java809.question044.Book;
import certificate.training.java809.question045.Alpha;
import certificate.training.java809.question045.Beta;
import certificate.training.java809.question045.Gamma;
import certificate.training.java809.question048.EBook;
import certificate.training.java809.question054.Emp54;
import certificate.training.java809.question062.Address;
import certificate.training.java809.question062.Employee;
import certificate.training.java809.question064.Vehicle;
import certificate.training.java809.question067.Test;
import certificate.training.java809.question079.Moveable;
import certificate.training.java809.question082.Folder;
import certificate.training.java809.question091.MyThread;
import certificate.training.java809.question098.USCurrency;
import certificate.training.java809.question100.Master;
import certificate.training.java809.question100.Worker;
import certificate.training.java809.question101.X;
import certificate.training.java809.question101.Y;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    static final String RESOURCES_PATH = System.getProperty("user.dir") + "/resources/";

    public static void main(String[] args) throws Exception {
        //question8();
        //question9();
        //question10();
        //question11();
        //question35();
        //question41();
        //question43();
        //question44();
        //question45();
        //question48();
        //question49();
        //question50();
        //question51();
        //question54();
        //question55();
        //question62();
        //question64();
        //question67();
        //question68();
        //question70();
        //question71();
        //question74();
        //question75();
        //question76();
        //question77();
        //question78();
        //question79();
        //question80();
        //question81();
        //question82();
        //question85();
        //question88();
        //question91();
        //question93();
        //question96();
        //question100();
        question101();
        if (Math.random() >-1)throw new Exception ("Try again");
    }
    
    static void question101() {
        X xRef = new Y();
        Y yRef = (Y) xRef;
        yRef.mY();
        xRef.mX();
    }

    static void question100() {
        Master master = new Master(); 
        //line n2, Answer is C
        CyclicBarrier cb = new CyclicBarrier(1, master);
        Worker worker = new Worker(cb);
        worker.start();
        
        /*
            A. At line n2, insert CyclicBarrier cb = new CyclicBarrier(2, master);
            B. Replace line n1 with class Master extends Thread {
            C. At line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
            D. At line n2, insert CyclicBarrier cb = new CyclicBarrier(master);
        */
    }

    static void question98() {
        USCurrency usCoin = USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }

    static void question96() {
        Customer c1 = new Customer("Larry", "Smith");
        Customer c2 = new Customer("Pedro", "Gonzales");
        Customer c3 = new Customer("Penny", "Jones");
        Customer c4 = new Customer("Lars", "Svenson");
        c4 = null;
        c3 = c2;
        System.out.println(Customer.getCount());
    }

    static void question93() throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader(RESOURCES_PATH + "employee.txt"))) { // line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br;//line n2
        }

        brCopy.ready(); //line n3;
    }

    static void question91() {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread[] ta = {thread1, thread2, thread3};
        for (int x = 0; x < 3; x++) {
            ta[x].start();
        }
    }

    static void question88() {
        UnaryOperator<Integer> uo1 = s -> s * 2;//line n1
        List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
        loanValues.stream()
                .filter(lv -> lv >= 1500)
                // .map(lv -> uo1.apply(lv)) //line n2
                .forEach(s -> System.out.print(s + " "));
    }

    static void question85() {
        /* Fixed Code */
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Jim : ".concat(s);

        nL.stream()
                .map(funVal)
                .peek(System.out::print);

    }

    static void question82() throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }

    }

    static void question81() {
        Map<Integer, String> books = new TreeMap<>();
        books.put(1007, "A");
        books.put(1002, "C");
        books.put(1001, "B");
        books.put(1003, "B");
        System.out.println(books);
    }

    static void question80() {
        int[] array = {1, 2, 3};
        //for ( foo ) {}

        /* A,B,C are correct        
            A. int i: array
            B. int i = 0; i < 1; i++ 
            C. ;;
            D. ; i < 1; i++
            E. ; i < 1;
         */
    }

    static void question79() {
        /* Answer is A */
        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);

        /*
        A:
        Moveable<Integer> animal = n -> System.out.println("Running" + n);
        animal.run(100);
        animal.walk(20);
        B :
        Moveable<Integer> animal = n -> n + 10;
        animal.run(100);
        animal.walk(20);
        C :
        Moveable animal = (Integer n) -> System.out.println(n);
        animal.run(100);
        Moveable.walk(20);*/
    }

    static void question78() {
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(50, "j");

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.putAll(unsortMap);

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    static void question77() {
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);

        Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .forEach(s -> System.out.print(s + " "));

        /*
        A. Stream.of(list1, list2)
            .flatMap(list -> list.stream())
            .forEach(s -> System.out.print(s + " ")); 
        B. Stream.of(list1, list2)
            .flatMap(list -> list.intStream())
            .forEach(s -> System.out.print(s + " "));
        C. list1.stream().flatMap(list2.stream()
            .flatMap(e1 -> e1.stream())
            .forEach(s -> System.out.println(s + " "));
        D. Stream.of(list1, list2)
            .flatMapToInt(list -> list.stream())
            .forEach(s -> System.out.print(s + " "));
         */
    }

    static void question76() throws Exception {
        Path source = Paths.get(RESOURCES_PATH + "/green.txt");
        Path target = Paths.get(RESOURCES_PATH + "/colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }

    static void question75() throws Exception {
        Path file = Paths.get(RESOURCES_PATH + "courses.txt");

        /*Answer is D*/
        Stream<String> fc = Files.lines(file);
        fc.forEach(s -> System.out.println(s));

        /*A.List<String> fc = Files.list(file);
        fc.stream().forEach(s -> System.out.println(s));
        B.Stream<String> fc = Files.readAllLines(file);
        fc.forEach(s -> System.out.println(s));
        C.List<String> fc = readAllLines(file);
        fc.stream().forEach(s -> System.out.println(s));
        D.Stream<String> fc = Files.lines(file);
        fc.forEach(s -> System.out.println(s));*/
    }

    static void question74() {
        String color = "teal";
        switch (color) {
            case "Red":
                System.out.println("Found Red");
            case "Blue":
                System.out.println("Found Blue");
                break;
            case "Teal":
                System.out.println("Found Teal");
                break;
            default:
                System.out.println("Found Default");
        }
    }

    static void question71() {
        try {
            int arr[] = {100, 100};
            dispResult(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("second exception");
        } catch (Exception e) {
            System.out.println("third exception");
        }
    }

    static void dispResult(int[] num) {
        try {
            System.err.println(num[1] / num[1] - num[2]);
        } catch (ArithmeticException e) {
            System.out.println("first exception");
        }

        System.out.println("Done");
    }

    static void question70() {
        LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
    }

    static void question68() {
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("Searching...");
            return n.contains("red");
        };

        colors.stream()
                .filter(c -> c.length() > 3).allMatch(test);

    }

    static void question67() {
        Test<String> type = new Test<>();
        Test type1 = new Test();    //line n1 
        type1.set(100); //line n2 
        System.out.print(type.getT() + " " + type1.getT());
    }

    static void question64() {
        Set<Vehicle> vehicles = new TreeSet<>();
        vehicles.add(new Vehicle(10123, "Ford"));
        vehicles.add(new Vehicle(10124, "BMW"));
        System.out.println(vehicles);
    }

    static void question62() {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity()
                : "City Not available";

        System.out.println(eAddress);
    }

    static void question55() {
        List<Integer> codes = Arrays.asList(10, 20);
        UnaryOperator<Double> uo = s -> s + 10.0;
        //codes.replaceAll(uo);
        codes.forEach(c -> System.out.println(c));
    }

    static void question54() {
        List<Emp54> li = Arrays.asList(new Emp54("Sam", 20),
                new Emp54("John", 60),
                new Emp54("Jim", 51)
        );

        Predicate<Emp54> agVal = s -> s.getEAge() > 50;//line n1
        li = li.stream().filter(agVal).collect(Collectors.toList());
        Stream<String> names = li.stream().map(Emp54::getEName);//line n2 
        names.forEach(n -> System.out.print(n + " "));
    }

    static void question51() {
        IntStream stream = IntStream.of(1, 2, 3);
        //IntFunction<Integer> inFu = x -> y -> x * y;        //line n1
        IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;  //B
        IntStream newStream = stream.map(inFu.apply(10));   //line n2 
        newStream.forEach(System.out::print);

        /*
        A. Replace line n1 with:
        IntFunction<UnaryOperator> inFu = x -> y -> x*y;
        
        B. Replace line n1 with:
        IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
        
        C. Replace line n1 with:
        BiFunction<IntUnaryOperator> inFu = x -> y -> x*y;
        
        D. Replace line n2 with:
        IntStream newStream = stream.map(inFu.applyAsInt (10));
         */
    }

    static void question50() {
        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str::indexOf; //line n1 
        int x = indexVal.applyAsInt("a");//line n2 
        System.out.println(x);
    }

    static void question49() {
        List<Integer> nums = Arrays.asList(10, 20, 8);
        System.out.println(
                //line n1
                nums.stream().max(Comparator.comparing(a -> a)).get()
        //nums.stream().max(Integer : : max).get()
        //nums.stream().max()
        //nums.stream().map(a -> a).max()
        );
    }

    static void question48() {
        certificate.training.java809.question048.Book b1 = new certificate.training.java809.question048.Book();
        //b1.read("Java Programing");
        certificate.training.java809.question048.Book b2 = new EBook();
        //b2.read("http://ebook.com/ebook");
    }

    static void question45() {
        List<Alpha> strs = new ArrayList<Alpha>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gamma());

        for (Alpha t : strs) {
            System.err.println(t.doStuff("Java"));
        }
    }

    static void question44() {
        List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
        Collections.sort(books, new Book());
        System.out.print(books);
    }

    static void question43() {
        List<Emp43> emp = Arrays.asList(new Emp43("John", "Smith"),
                new Emp43("Peter", "Sam"),
                new Emp43("Thomas", "Wale"));
        emp.stream()
                .sorted(Comparator.comparing(Emp43::getfName).reversed().thenComparing(Emp43::getlName)) // A
                //.sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName)) // B
                //.map(Emp::getfName).sorted(Comparator.reserveOrder()) // C
                //.map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved // D
                .collect(Collectors.toList());

    }
    
    static void question41() {
        int b = 3;
        if (!(b > 3)) {
            System.out.println("square ");
        }
        {
            System.out.println("circle ");
        }
        System.out.println("...");

    }

    static void question8() {
        List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices", "101, Peter, HR");
        empDetails.stream()
                .filter(s -> s.contains("1"))
                .sorted().forEach(System.out::println); //line n1
    }

    static void question9() {
        String theString = "Hello World";
        System.out.println(theString.charAt(11));
    }

    static void question10() {
        Foo<String, Integer> mark = new Foo<>("Steve", 100);
        Foo<String, String> pair = Foo.<String>twice("Hello World!");
        Foo<?, ?> percentage = new Foo<>(97, 32);
        Foo<String, String> grade = new Foo<>("John", "A");
    }

    static void question11() {
//        List<Product> products = Arrays.asList(new Product(1, 10),
//                new Product(2, 30),
//                new Product(2, 30));
//        Product p = products.stream().reduce(new Product(4, 0), (p1, p2) -> {
//            p1.price += p2.price;
//            return new Product(p1.id, p1.price);
//        });
//        products.add(p);
//        products.stream().parallel()
//                .reduce((p1, p2) - >  p1.price > p2.price ? p1 : p2).ifPresent(System.out: :println));
    }

    static void question35() {
        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + ":");

            return result;
        };
        str.stream()
                .filter(test)
                .findFirst().ifPresent(System.out::print);
    }

}
