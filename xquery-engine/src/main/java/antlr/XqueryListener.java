// Generated from /Users/wilsonli/IdeaProjects/xquery-engine/src/main/resources/Xquery.g4 by ANTLR 4.5.1
package src.main.java.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQWithPar(XqueryParser.XQWithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQWithPar(XqueryParser.XQWithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTwoXQ(XqueryParser.TwoXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTwoXQ(XqueryParser.TwoXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQStrConst(XqueryParser.XQStrConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQStrConst(XqueryParser.XQStrConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRp(XqueryParser.XQRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRp(XqueryParser.XQRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRpAll(XqueryParser.XQRpAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRpAll(XqueryParser.XQRpAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XqueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XqueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondOR(XqueryParser.XQCondORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondOR(XqueryParser.XQCondORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondWithPar(XqueryParser.XQCondWithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondWithPar(XqueryParser.XQCondWithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XqueryParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XqueryParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XqueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XqueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XqueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XqueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPconst(XqueryParser.FRPconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPconst(XqueryParser.FRPconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRP(XqueryParser.FRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRP(XqueryParser.FRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPand(XqueryParser.FRPandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPand(XqueryParser.FRPandContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(XqueryParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(XqueryParser.ConstantContext ctx);
}