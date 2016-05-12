// Generated from /Users/wilsonli/IdeaProjects/xquery/src/main/resources/XQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQVariable(XQueryParser.XQVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQVariable(XQueryParser.XQVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAp(XQueryParser.XQApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAp(XQueryParser.XQApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQWithPar(XQueryParser.XQWithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQWithPar}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQWithPar(XQueryParser.XQWithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTwoXQ(XQueryParser.TwoXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTwoXQ(XQueryParser.TwoXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQLet(XQueryParser.XQLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQStrConst(XQueryParser.XQStrConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQStrConst}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQStrConst(XQueryParser.XQStrConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRp(XQueryParser.XQRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRp(XQueryParser.XQRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRpAll(XQueryParser.XQRpAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRpAll}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRpAll(XQueryParser.XQRpAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQTag(XQueryParser.XQTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQTag(XQueryParser.XQTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEqual(XQueryParser.XQCondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEqual(XQueryParser.XQCondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondIs(XQueryParser.XQCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondIs(XQueryParser.XQCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondAnd(XQueryParser.XQCondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondAnd(XQueryParser.XQCondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondNot(XQueryParser.XQCondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondNot(XQueryParser.XQCondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEmpty(XQueryParser.XQCondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEmpty(XQueryParser.XQCondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondSome(XQueryParser.XQCondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondSome(XQueryParser.XQCondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondOR(XQueryParser.XQCondORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondOR}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondOR(XQueryParser.XQCondORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondWithPar(XQueryParser.XQCondWithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondWithPar}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondWithPar(XQueryParser.XQCondWithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPChildren(XQueryParser.APChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPChildren(XQueryParser.APChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPAll(XQueryParser.APAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPAll(XQueryParser.APAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XQueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XQueryParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XQueryParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPChildren(XQueryParser.RPChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPChildren(XQueryParser.RPChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPwithPar(XQueryParser.RPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPwithPar(XQueryParser.RPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XQueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XQueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XQueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XQueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAll(XQueryParser.RPAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAll(XQueryParser.RPAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRP(XQueryParser.TwoRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRP(XQueryParser.TwoRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCondition(XQueryParser.RPConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCondition(XQueryParser.RPConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPnot(XQueryParser.FRPnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPnot(XQueryParser.FRPnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPwithPar(XQueryParser.FRPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPwithPar(XQueryParser.FRPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPconst(XQueryParser.FRPconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPconst(XQueryParser.FRPconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRP(XQueryParser.FRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRP(XQueryParser.FRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPor(XQueryParser.FRPorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPor(XQueryParser.FRPorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPequal(XQueryParser.FRPequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPequal(XQueryParser.FRPequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPis(XQueryParser.FRPisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPis(XQueryParser.FRPisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPand(XQueryParser.FRPandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XQueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPand(XQueryParser.FRPandContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(XQueryParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(XQueryParser.ConstantContext ctx);
}