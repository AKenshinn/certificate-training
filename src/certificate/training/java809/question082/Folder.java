package certificate.training.java809.question082;

import java.io.IOException;

public class Folder implements AutoCloseable { //line n1 , A

    //line n2, D
    public void close() throws IOException {
        System.out.print("Close");
    }

    public void open() {
        System.out.print("Open");
    }

}
