// Generated from /Users/wilsonli/IdeaProjects/xquery-engine/src/main/resources/Xquery.g4 by ANTLR 4.5.1
package src.main.java.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link XqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XqueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XqueryParser.DocContext ctx);
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
	 * Enter a parse tree produced by the {@code RPindex}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPindex(XqueryParser.RPindexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPindex}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPindex(XqueryParser.RPindexContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link XqueryParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(XqueryParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(XqueryParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAP}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAP(XqueryParser.XQAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAP}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAP(XqueryParser.XQAPContext ctx);
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
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVariable(XqueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVariable(XqueryParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(XqueryParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(XqueryParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQuery}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQuery(XqueryParser.XQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQuery}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQuery(XqueryParser.XQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQwithPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQwithPar(XqueryParser.XQwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQwithPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQwithPar(XqueryParser.XQwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterJoin(XqueryParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitJoin(XqueryParser.JoinContext ctx);
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
	 * Enter a parse tree produced by the {@code XQRPall}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRPall(XqueryParser.XQRPallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRPall}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRPall(XqueryParser.XQRPallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQRP}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQRP(XqueryParser.XQRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQRP}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQRP(XqueryParser.XQRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Result}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterResult(XqueryParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Result}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitResult(XqueryParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#vlist}.
	 * @param ctx the parse tree
	 */
	void enterVlist(XqueryParser.VlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#vlist}.
	 * @param ctx the parse tree
	 */
	void exitVlist(XqueryParser.VlistContext ctx);
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
	 * Enter a parse tree produced by the {@code Condor}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondor(XqueryParser.CondorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condor}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondor(XqueryParser.CondorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condequal}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondequal(XqueryParser.CondequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condequal}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondequal(XqueryParser.CondequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(XqueryParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(XqueryParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(XqueryParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(XqueryParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condis}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondis(XqueryParser.CondisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condis}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondis(XqueryParser.CondisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condnot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondnot(XqueryParser.CondnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condnot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondnot(XqueryParser.CondnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondwithPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondwithPar(XqueryParser.CondwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondwithPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondwithPar(XqueryParser.CondwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condand}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondand(XqueryParser.CondandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condand}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondand(XqueryParser.CondandContext ctx);
}