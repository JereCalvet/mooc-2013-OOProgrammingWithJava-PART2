package reader.criteria;

/**
 *
 * @author Jere
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        return line.endsWith("?") || line.endsWith("!");
    } 
}
