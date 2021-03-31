package za.ac.cput.testdrivendevelopment;

/**
 *
 * @author Zaeem Petersen - 219010145
 */
public class program {

    private int size;
    private int version;

    public program() {
    }

    @Override
    public String toString() {
        return "program{" + "size=" + size + ", version=" + version + '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
