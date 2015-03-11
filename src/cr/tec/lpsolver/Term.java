package cr.tec.lpsolver;

/**
 * The {@code Term} is the basic element the {@link Linear}. 
 * It is a coefficient and its variable.
 * 
 * @author jose
 */
public class Term {
    
    private final String variable;
    private final Double coefficient;

    /**
     * Constructs a {@code Term}.
     * 
     * @param variable The variable.
     * @param coefficient The coefficient.
     *            
     */
    public Term(String variable, Double coefficient) {
        this.variable = variable;
        this.coefficient = coefficient;
    }

    /**
     * Returns the variable.
     * 
     * @return the variable
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Returns the coefficient.
     * 
     * @return the coefficient
     */
    public Double getCoefficient() {
        return coefficient;
    }

}
