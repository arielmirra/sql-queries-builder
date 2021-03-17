package querybuilder.implementations;

import daoo.query.*;
import querybuilder.NumericCompoundExpression;

public class StrColumn extends ColumnImpl<String> {

    public StrColumn(String name) {
        super(name);
    }

    public Criteria startsWith(String str) {
        return new Criteria(DefaultOperator.LIKE, Constant.constant(str + "%"));
    }

    public NumericCompoundExpression length() {
        return new NumericCompoundExpression(DefaultOperator.STRING_LENGTH, this);
    }
}