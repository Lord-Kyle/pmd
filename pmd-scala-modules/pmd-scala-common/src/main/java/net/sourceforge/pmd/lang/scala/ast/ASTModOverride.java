/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Mod;

/**
 * The ASTModOverride node implementation.
 */
public final class ASTModOverride extends AbstractScalaNode<Mod.Override> {

    ASTModOverride(Mod.Override scalaNode) {
        super(scalaNode);
    }

    // java.lang package is required or else PMD can't see this Override
    @java.lang.Override
    protected <D, R> R acceptVisitor(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
