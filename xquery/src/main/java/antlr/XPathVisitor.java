// Generated from /Users/wilsonli/IdeaProjects/xquery/src/main/resources/XPath.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPChildren(XPathParser.APChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPAll(XPathParser.APAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XPathParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XPathParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPChildren(XPathParser.RPChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPwithPar(XPathParser.RPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XPathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XPathParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAll(XPathParser.RPAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRP(XPathParser.TwoRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCondition(XPathParser.RPConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPnot(XPathParser.FRPnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPwithPar(XPathParser.FRPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPconst(XPathParser.FRPconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRP(XPathParser.FRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPor(XPathParser.FRPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPequal(XPathParser.FRPequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPis(XPathParser.FRPisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPand(XPathParser.FRPandContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(XPathParser.ConstantContext ctx);
}