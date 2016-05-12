// Generated from /Users/wilsonli/IdeaProjects/xquery-engine/src/main/resources/Xquery.g4 by ANTLR 4.5.1
package src.main.java.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XqueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XqueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQWithPar(XqueryParser.XQWithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoXQ(XqueryParser.TwoXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQStrConst(XqueryParser.XQStrConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQRp(XqueryParser.XQRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQRpAll(XqueryParser.XQRpAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XqueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondOR(XqueryParser.XQCondORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondWithPar(XqueryParser.XQCondWithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XqueryParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XqueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XqueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPconst(XqueryParser.FRPconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRP(XqueryParser.FRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPand(XqueryParser.FRPandContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(XqueryParser.ConstantContext ctx);
}