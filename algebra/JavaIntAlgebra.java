/*
 * GROOVE: GRaphs for Object Oriented VErification Copyright 2003--2007
 * University of Twente
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * $Id: JavaIntAlgebra.java 5931 2017-05-19 09:10:17Z rensink $
 */
package groove.algebra;

import java.util.List;

import groove.algebra.Sort;
import groove.algebra.syntax.Expression;

/**
 * Integer algebra based on the java type {@link Integer}.
 * @author Arend Rensink
 * @version $Revision: 5931 $
 */
public class JavaIntAlgebra extends IntAlgebra<Integer,Double,Boolean,String> {
    /** Private constructor for the singleton instance. */
    private JavaIntAlgebra() {
        // empty
    }

    
    public Integer abs(Integer arg) {
        return Math.abs(arg);
    }

    
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    
    public Integer bigmax(List<Integer> arg) {
        return arg.stream()
            .max(Integer::compareTo)
            .get();
    }

    
    public Integer bigmin(List<Integer> arg) {
        return arg.stream()
            .min(Integer::compareTo)
            .get();
    }

    
    public Integer div(Integer arg0, Integer arg1) {
        return arg0 / arg1;
    }

    
    public Boolean eq(Integer arg0, Integer arg1) {
        return arg0.equals(arg1);
    }

    
    public Boolean neq(Integer arg0, Integer arg1) {
        return !arg0.equals(arg1);
    }

    
    public Boolean ge(Integer arg0, Integer arg1) {
        return arg0 >= arg1;
    }

    
    public Boolean gt(Integer arg0, Integer arg1) {
        return arg0 > arg1;
    }

    
    public Boolean le(Integer arg0, Integer arg1) {
        return arg0 <= arg1;
    }

    
    public Boolean lt(Integer arg0, Integer arg1) {
        return arg0 < arg1;
    }

    
    public Integer max(Integer arg0, Integer arg1) {
        return Math.max(arg0, arg1);
    }

    
    public Integer min(Integer arg0, Integer arg1) {
        return Math.min(arg0, arg1);
    }

    
    public Integer mod(Integer arg0, Integer arg1) {
        return arg0 % arg1;
    }

    
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }

    
    public Integer neg(Integer arg) {
        return -arg;
    }

    
    public Integer prod(List<Integer> arg) {
        return arg.stream()
            .reduce(1, (i, j) -> i * j);
    }

    
    public Integer sub(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    
    public Integer sum(List<Integer> arg) {
        return arg.stream()
            .reduce(0, (i, j) -> i + j);
    }

    
    public Double toReal(Integer arg) {
        return new Double(arg);
    }

    
    public String toString(Integer arg) {
        return arg.toString();
    }

    
    public boolean isValue(Object value) {
        return value instanceof Integer;
    }

    
    public Expression toTerm(Object value) {
        return Constant.instance((Integer) value);
    }

    
    public Integer toValueFromConstant(Constant constant) {
        return constant.getIntRepr()
            .intValue();
    }

    /* The value is already of the right type. */
    
    public Integer toJavaValue(Object value) {
        return (Integer) value;
    }

    @Override
    protected Integer toValue(Integer constant) {
        return constant;
    }

    /**
     * Delegates to {@link Integer#toString()}.
     */
    @Override
    public String getSymbol(Object value) {
        return value.toString();
    }

    /** Returns {@link #NAME}. */
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public AlgebraFamily getFamily() {
        return AlgebraFamily.DEFAULT;
    }

    /** Name of the algebra. */
    public static final String NAME = "jint";
    /** Singleton instance of this algebra. */
    public static final JavaIntAlgebra instance = new JavaIntAlgebra();
	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}
}
