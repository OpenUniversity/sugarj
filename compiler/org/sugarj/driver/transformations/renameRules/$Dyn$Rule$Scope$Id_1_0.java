package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Scope$Id_1_0 extends Strategy 
{ 
  public static $Dyn$Rule$Scope$Id_1_0 instance = new $Dyn$Rule$Scope$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_10)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleScopeId_1_0");
    Fail10:
    { 
      IStrategoTerm r_89 = null;
      IStrategoTerm p_89 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail10;
      p_89 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      r_89 = annos4;
      term = b_10.invoke(context, p_89);
      if(term == null)
        break Fail10;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleScopeId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_89));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}