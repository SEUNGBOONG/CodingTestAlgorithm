package LV0;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArr {
    Stream<String > lineStream= Files.lines(Paths.get("file.txt")),
    Charset.forName("UTF-8");
    Stream<Product> parallelStream=productList.parallelStream();

}
