// Generated from /Users/wilsonli/IdeaProjects/xquery/src/main/resources/XQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQVariable(XQueryParser.XQVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAp(XQueryParser.XQApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQWithPar(XQueryParser.XQWithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoXQ(XQueryParser.TwoXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQStrConst(XQueryParser.XQStrConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQRp(XQueryParser.XQRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQRpAll(XQueryParser.XQRpAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQTag(XQueryParser.XQTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEqual(XQueryParser.XQCondEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondIs(XQueryParser.XQCondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondAnd(XQueryParser.XQCondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondNot(XQueryParser.XQCondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEmpty(XQueryParser.XQCondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondSome(XQueryParser.XQCondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondOR(XQueryParser.XQCondORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondWithPar(XQueryParser.XQCondWithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPChildren(XQueryParser.APChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPAll(XQueryParser.APAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XQueryParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XQueryParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPChildren(XQueryParser.RPChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPwithPar(XQueryParser.RPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XQueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XQueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAll(XQueryParser.RPAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRP(XQueryParser.TwoRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCondition(XQueryParser.RPConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPnot(XQueryParser.FRPnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPwithPar(XQueryParser.FRPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPconst(XQueryParser.FRPconstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRP(XQueryParser.FRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPor(XQueryParser.FRPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPequal(XQueryParser.FRPequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPis(XQueryParser.FRPisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPand(XQueryParser.FRPandContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(XQueryParser.ConstantContext ctx);
}