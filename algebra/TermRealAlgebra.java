/* GROOVE: GRaphs for Object Oriented VErification
 * Copyright 2003--2007 University of Twente
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * $Id: TermRealAlgebra.java 5931 2017-05-19 09:10:17Z rensink $
 */
package groove.algebra;

import java.util.List;
import groove.algebra.BoolSignature.Op;
import groove.algebra.Sort;
import groove.algebra.syntax.Expression;


/**
 * Implementation of reals consisting of a singleton value.
 * To be used in conjunction with {@link PointBoolAlgebra} and {@link PointStringAlgebra}.
 * @author Arend Rensink
 * @version $Revision $
 */
public class TermRealAlgebra extends RealAlgebra<Expression,Expression,Expression,Expression> {
    /** Private constructor for the singleton instance. */
    private TermRealAlgebra() {
        // empty
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public AlgebraFamily getFamily() {
        return AlgebraFamily.TERM;
    }

    @Override
    public boolean isValue(Object value) {
        return value instanceof Expression && ((Expression) value).getSort() == getSort();
    }

    @Override
    public String getSymbol(Object value) {
        return ((Expression) value).toDisplayString();
    }

    @Override
    public Expression toTerm(Object value) {
        return (Expression) value;
    }

    @Override
    public Expression toValueFromConstant(Constant constant) {
        return constant;
    }

    @Override
    public Double toJavaValue(Object value) {
        return (Double) AlgebraFamily.DEFAULT.toValue((Expression) value);
    }

    
    protected Constant toValueFromJavaDouble(Double value) {
        return Constant.instance(value);
    }

    
    public Expression abs(Expression arg) {
        return Op.ABS.getOperator()
            .newTerm(arg);
    }


    public Expression add(Expression arg0, Expression arg1) {
        return Op.ADD.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression bigmax(List<Expression> arg) {
        return Op.MAX.getOperator()
            .newTerm(arg.toArray(new Expression[arg.size()]));
    }

    
    public Expression bigmin(List<Expression> arg) {
        return Op.MIN.getOperator()
            .newTerm(arg.toArray(new Expression[arg.size()]));
    }

    
    public Expression div(Expression arg0, Expression arg1) {
        return Op.DIV.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression eq(Expression arg0, Expression arg1) {
        return Op.EQ.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression neq(Expression arg0, Expression arg1) {
        return Op.NEQ.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression ge(Expression arg0, Expression arg1) {
        return Op.GE.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression gt(Expression arg0, Expression arg1) {
        return Op.GT.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression le(Expression arg0, Expression arg1) {
        return Op.LE.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression lt(Expression arg0, Expression arg1) {
        return Op.LT.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression max(Expression arg0, Expression arg1) {
        return Op.MAX.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression min(Expression arg0, Expression arg1) {
        return Op.MIN.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression mul(Expression arg0, Expression arg1) {
        return Op.MUL.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression neg(Expression arg) {
        return Op.NEG.getOperator()
            .newTerm(arg);
    }

    
    public Expression prod(List<Expression> arg) {
        return Op.PROD.getOperator()
            .newTerm(arg.toArray(new Expression[arg.size()]));
    }

    
    public Expression sub(Expression arg0, Expression arg1) {
        return Op.SUB.getOperator()
            .newTerm(arg0, arg1);
    }

    
    public Expression sum(List<Expression> arg) {
        return Op.SUM.getOperator()
            .newTerm(arg.toArray(new Expression[arg.size()]));
    }

    
    public Expression toInt(Expression arg) {
        return Op.TO_INT.getOperator()
            .newTerm(arg);
    }

    
    public Expression toString(Expression arg) {
        return Op.TO_STRING.getOperator()
            .newTerm(arg);
    }

    /** Name of this algebra. */
    public static final String NAME = "treal";
    /** Singleton instance of this algebra. */
    public static final TermRealAlgebra instance = new TermRealAlgebra();
	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}
}
