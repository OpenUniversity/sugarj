package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Extensions_0_1 extends Strategy 
{ 
  public static smart_$Extensions_0_1 instance = new smart_$Extensions_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_158)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_158 = new TermReference(ref_w_158);
    context.push("smart_Extensions_0_1");
    Fail439:
    { 
      IStrategoTerm x_158 = null;
      IStrategoTerm k_159 = null;
      IStrategoTerm m_159 = null;
      term = extraction.constNil0;
      lifted183 lifted1830 = new lifted183();
      lifted1830.w_158 = w_158;
      term = try_1_0.instance.invoke(context, term, lifted1830);
      if(term == null)
        break Fail439;
      x_158 = term;
      if(w_158.value == null)
        break Fail439;
      term = (IStrategoTerm)termFactory.makeListCons(w_158.value, (IStrategoList)extraction.constNil0);
      k_159 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_159, NO_STRATEGIES, new IStrategoTerm[]{extraction.const422});
      if(term == null)
        break Fail439;
      m_159 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_158);
      if(term == null)
        break Fail439;
      term = put_syntax_sort_0_1.instance.invoke(context, m_159, term);
      if(term == null)
        break Fail439;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}