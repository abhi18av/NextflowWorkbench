package org.campagnelab.workflow.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;
  public static boolean baseMappingRule_Condition_6588488528875770526(final BaseMappingRuleContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, 0x5b6f0368e19f7320L, "reports"))).isNotEmpty() || ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, 0x5a479937fe29326dL, "processes"))).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode p) {
        return ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(p, MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe293272L, 0x5a479937fe293273L, "process")), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x677d1579f929d8b1L, 0x677d1579f92a34b0L, "outputs"))).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b60a953cL, 0x23f1edb6b6ac2d5fL, "expression")) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b60a953cL, 0x23f1edb6b6ac2d5fL, "expression"));
          }
        }) != null;
      }
    }) || ListSequence.fromList(SNodeOperations.getNodeDescendants(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, "org.campagnelab.workflow.structure.Closurefunction"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode closurefct) {
        return (SLinkOperations.getTarget(closurefct, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")) != null);
      }
    });
  }
  public static Object propertyMacro_GetPropertyValue_6588488528877583532(final PropertyMacroContext _context) {
    return "reportAbout_" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5b6f0368e1a01702L, 0x5b6f0368e1a01714L, "channel")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_4533252666381197540(final PropertyMacroContext _context) {
    return "expression_" + SPropertyOperations.getString(SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x677d1579f929d8b1L, "org.campagnelab.workflow.structure.Process"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + SPropertyOperations.getString(SNodeOperations.getNodeAncestor(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression")), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b60a953cL, "org.campagnelab.workflow.structure.ProcessOutput"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8584871179161877728(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, 0x23f1edb6b6fc5746L, "input")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_8584871179163434037(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b74709cdL, 0x23f1edb6b74709ceL, "var")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_3250385120951750137(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_3280266319710997405(final PropertyMacroContext _context) {
    if (LOG.isInfoEnabled()) {
      LOG.info("MethodName");
    }
    if (LOG.isInfoEnabled()) {
      LOG.info("node.closure.parameter" + ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf02c34L, "parameter"))).count());
    }
    if (LOG.isInfoEnabled()) {
      LOG.info("node.closure.parameter.first.type" + SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf02c34L, "parameter"))).first(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")));
    }
    if (LOG.isInfoEnabled()) {
      LOG.info("node.closure.parameter.first.name" + SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")), MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf02c34L, "parameter"))).first(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
    }

    return "Closure_" + SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, "org.campagnelab.workflow.structure.InputChannel"), false, false), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, 0x7426d6fa2ae487c7L, "connectedTo")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + SConceptOperations.conceptAlias(SNodeOperations.getConcept(_context.getNode()));
  }
  public static Object propertyMacro_GetPropertyValue_6588488528875764642(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + "Methods";
  }
  public static Object propertyMacro_GetPropertyValue_8584871179158633314(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, 0x23f1edb6b6fc5746L, "input")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object referenceMacro_GetReferent_6588488528877591735(final ReferenceMacroContext _context) {
    // the function is typed as its only parameter: 
    String channelElementType = String.valueOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5b6f0368e1a01702L, 0x5b6f0368e1a01716L, "function"))));
    return channelElementType;
  }
  public static Object referenceMacro_GetReferent_8584871179158628605(final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, 0x23f1edb6b6fc5746L, "input")), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ae32ad2L, 0x6692b82cc4bc0478L, "type")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static SNode sourceNodeQuery_4533252666381299731(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression"));
  }
  public static SNode sourceNodeQuery_8584871179166981489(final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression")));
  }
  public static SNode sourceNodeQuery_8584871179163796297(final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, 0x23f1edb6b6fc5746L, "input")), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ae32ad2L, 0x6692b82cc4bc0478L, "type")));
  }
  public static SNode sourceNodeQuery_8584871179163878942(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b74709cdL, 0x23f1edb6b74709ceL, "var")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"));
  }
  public static SNode sourceNodeQuery_5076706242462689989(final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type")), "virtual_getJavaType_1213877337345", new Object[]{});
  }
  public static SNode sourceNodeQuery_6004877973590147755(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure"));
  }
  public static Iterable<SNode> sourceNodesQuery_5772540756690217673(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5b6f0368e1a01702L, 0x5b6f0368e1a01716L, "function")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x108bbca0f48L, 0x108bbd29b4aL, "body")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"));
  }
  public static Iterable<SNode> sourceNodesQuery_6588488528877577835(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, 0x5b6f0368e19f7320L, "reports"));
  }
  public static Iterable<SNode> sourceNodesQuery_8584871179161866609(final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression")), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, "org.campagnelab.workflow.structure.InputValue"), false, new SAbstractConcept[]{});
  }
  public static Iterable<SNode> sourceNodesQuery_8584871179163434026(final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression")), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b74709cdL, "org.campagnelab.workflow.structure.InputFromBaseLanguageScript"), false, new SAbstractConcept[]{});
  }
  public static Iterable<SNode> sourceNodesQuery_8584871179158476143(final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, 0x5a479937fe29326dL, "processes"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe293272L, 0x5a479937fe293273L, "process")) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe293272L, 0x5a479937fe293273L, "process"));
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x677d1579f929d8b1L, 0x677d1579f92a34b0L, "outputs"));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b60a953cL, 0x23f1edb6b6ac2d5fL, "expression")) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b60a953cL, 0x23f1edb6b6ac2d5fL, "expression"));
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_5006385360784363130(final SourceSubstituteMacroNodesContext _context) {

    SNode currentWorkflow = SNodeOperations.as(_context.getOriginalCopiedInputNode(SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, "org.campagnelab.workflow.structure.Workflow"), false, false)), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, "org.campagnelab.workflow.structure.Workflow"));

    if (LOG.isInfoEnabled()) {
      LOG.info("Parameter current" + ListSequence.fromList(SNodeOperations.getNodeDescendants(currentWorkflow, MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, "org.campagnelab.workflow.structure.Closurefunction"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode closure) {
          return SNodeOperations.getIndexInParent(closure) == SNodeOperations.getIndexInParent(_context.getNode()) & SPropertyOperations.hasValue(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(closure, MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, "org.campagnelab.workflow.structure.InputChannel"), false, false), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, 0x7426d6fa2ae487c7L, "connectedTo")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, "org.campagnelab.workflow.structure.InputChannel"), false, false), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, 0x7426d6fa2ae487c7L, "connectedTo")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
        }
      }).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")) != null);
        }
      }).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure"));
        }
      }).translate(new ITranslator2<SNode, SNode>() {
        public Iterable<SNode> translate(SNode it) {
          return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf02c34L, "parameter"));
        }
      }));
    }

    return ListSequence.fromList(SNodeOperations.getNodeDescendants(currentWorkflow, MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, "org.campagnelab.workflow.structure.Closurefunction"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode closure) {
        return SNodeOperations.getIndexInParent(closure) == SNodeOperations.getIndexInParent(_context.getNode()) & SPropertyOperations.hasValue(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(closure, MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, "org.campagnelab.workflow.structure.InputChannel"), false, false), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, 0x7426d6fa2ae487c7L, "connectedTo")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, "org.campagnelab.workflow.structure.InputChannel"), false, false), MetaAdapterFactory.getReferenceLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x7426d6fa2ade0f7aL, 0x7426d6fa2ae487c7L, "connectedTo")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure"));
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0xfd3920347849419dL, 0x907112563d152375L, 0x1174bed3125L, 0x1174bf02c34L, "parameter"));
      }
    });

  }
  public static Iterable<SNode> sourceNodesQuery_3280266319710997398(final SourceSubstituteMacroNodesContext _context) {

    final SNode myWorkflow = SNodeOperations.getNodeAncestor(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, "org.campagnelab.workflow.structure.Workflow"), false, false);
    ListSequence.fromList(SModelOperations.roots(_context.getInputModel(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x5a479937fe28b29cL, "org.campagnelab.workflow.structure.Workflow"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(myWorkflow, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
    });

    return ListSequence.fromList(SNodeOperations.getNodeDescendants(_context.getNode(), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, "org.campagnelab.workflow.structure.Closurefunction"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(final SNode clrfct) {
        return ListSequence.fromList(SNodeOperations.getNodeDescendants(myWorkflow, MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, "org.campagnelab.workflow.structure.Closurefunction"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0xf4adeec5270056eL, 0x169c268b6bd1c62fL, "closure")) != null) & SNodeOperations.getIndexInParent(clrfct) == SNodeOperations.getIndexInParent(it);
          }
        });
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_8584871179160222277(final SourceSubstituteMacroNodesContext _context) {
    return SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6ac375bL, 0x23f1edb6b6ac3798L, "expression")), MetaAdapterFactory.getConcept(0xc6c823fba9da46e7L, 0x9850129b0f7a7aa5L, 0x23f1edb6b6fc5345L, "org.campagnelab.workflow.structure.InputValue"), false, new SAbstractConcept[]{});
  }
  protected static Logger LOG = LogManager.getLogger(QueriesGenerated.class);
}
