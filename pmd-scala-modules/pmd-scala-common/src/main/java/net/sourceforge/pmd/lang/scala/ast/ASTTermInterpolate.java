/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Term;

/**
 * The ASTTermInterpolate node implementation.
 */
public final class ASTTermInterpolate extends AbstractScalaNode<Term.Interpolate> {

    ASTTermInterpolate(Term.Interpolate scalaNode) {
        super(scalaNode);
    }

    @Override
    protected <D, R> R acceptVisitor(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
