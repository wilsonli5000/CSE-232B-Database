// Generated from /Users/wilsonli/IdeaProjects/xquery/src/main/resources/XPath.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPChildren(XPathParser.APChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPChildren(XPathParser.APChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPAll(XPathParser.APAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPAll(XPathParser.APAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XPathParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XPathParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(XPathParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(XPathParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPChildren(XPathParser.RPChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPChildren(XPathParser.RPChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPwithPar(XPathParser.RPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPwithPar(XPathParser.RPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XPathParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XPathParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XPathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XPathParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAll(XPathParser.RPAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAll(XPathParser.RPAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRP(XPathParser.TwoRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRP(XPathParser.TwoRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCondition(XPathParser.RPConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCondition(XPathParser.RPConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPnot(XPathParser.FRPnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPnot(XPathParser.FRPnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPwithPar(XPathParser.FRPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPwithPar(XPathParser.FRPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPconst(XPathParser.FRPconstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPconst}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPconst(XPathParser.FRPconstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRP(XPathParser.FRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRP(XPathParser.FRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPor(XPathParser.FRPorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPor(XPathParser.FRPorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPequal(XPathParser.FRPequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPequal(XPathParser.FRPequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPis(XPathParser.FRPisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPis(XPathParser.FRPisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPand(XPathParser.FRPandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XPathParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPand(XPathParser.FRPandContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(XPathParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(XPathParser.ConstantContext ctx);
}