package reader;

import reader.criteria.*;

public class Main {

    public static void main(String[] args) {
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion words = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        Criterion rightLength = new Both(
                new LengthAtLeast(20),
                new Not(new LengthAtLeast(31))
        );

        Criterion wanted = new Both(words, rightLength);

        for (String line : book.linesWhichComplyWith(wanted)) {
            System.out.println(line);
        }
    }
}
