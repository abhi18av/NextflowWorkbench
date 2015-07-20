package org.campagnelab.workflow.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;

public class EditorAspectDescriptorImpl implements EditorAspectDescriptor {

  public Collection<ConceptEditor> getEditors(ConceptDescriptor descriptor) {
    switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0b, descriptor.getConceptFqName())) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new BaseLanguageAdapter_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Boolean_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new BooleanChannel_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new BooleanElement_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new ChannelType_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ClusterOptions_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new Collate_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ConditionalExpressionText_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new ConditionalVariableRef_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new File_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new FileChannel_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new FileList_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new FileListChannel_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new Flatten_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new GlobalBooleanExpression_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new GlobalBooleanLiteral_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new GlobalBooleanLiteralList_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new GlobalBooleanLiteralTuple_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new GlobalChannel_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new GlobalFileExpression_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new GlobalFileListExpression_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new GlobalFileLiteralList_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new GlobalFileLiteralTuple_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new GlobalFilePath_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new GlobalIntegerExpression_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new GlobalIntegerLiteral_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new GlobalIntegerLiteralList_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new GlobalIntegerLiteralTuple_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new GlobalListExpression_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new GlobalListLiteral_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new GlobalListLiteralTuple_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new GlobalStringExpression_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new GlobalStringLiteral_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new GlobalStringLiteralList_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new GlobalStringLiteralTuple_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new GlobalTupleExpression_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new GlobalTupleListExpression_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new GlobalTupleListLiteral_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new GlobalTupleLiteral_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new Ignore_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new InputChannel_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new Integer_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new IntegerChannel_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new IntegerElement_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new List_Editor());
      case 45:
        return Collections.<ConceptEditor>singletonList(new ListChannel_Editor());
      case 46:
        return Collections.<ConceptEditor>singletonList(new ListElement_Editor());
      case 47:
        return Collections.<ConceptEditor>singletonList(new Local_Editor());
      case 48:
        return Collections.<ConceptEditor>singletonList(new Memory_Editor());
      case 49:
        return Collections.<ConceptEditor>singletonList(new NextflowConfig_Editor());
      case 50:
        return Collections.<ConceptEditor>singletonList(new NumCPUs_Editor());
      case 51:
        return Collections.<ConceptEditor>singletonList(new OutputChannel_Editor());
      case 52:
        return Collections.<ConceptEditor>singletonList(new Penv_Editor());
      case 53:
        return Collections.<ConceptEditor>singletonList(new Process_Editor());
      case 54:
        return Collections.<ConceptEditor>singletonList(new ProcessRef_Editor());
      case 55:
        return Collections.<ConceptEditor>singletonList(new Queue_Editor());
      case 56:
        return Collections.<ConceptEditor>singletonList(new QueueElement_Editor());
      case 57:
        return Collections.<ConceptEditor>singletonList(new RangeOfCharLiterals_Editor());
      case 58:
        return Collections.<ConceptEditor>singletonList(new RangeOfIntegerLiterals_Editor());
      case 59:
        return Collections.<ConceptEditor>singletonList(new Retry_Editor());
      case 60:
        return Collections.<ConceptEditor>singletonList(new RichScript_Editor());
      case 61:
        return Collections.<ConceptEditor>singletonList(new SGE_Editor());
      case 62:
        return Collections.<ConceptEditor>singletonList(new ScriptBooleanArgs_Editor());
      case 63:
        return Collections.<ConceptEditor>singletonList(new ScriptIntegerArgs_Editor());
      case 64:
        return Collections.<ConceptEditor>singletonList(new ScriptListArgs_Editor());
      case 65:
        return Collections.<ConceptEditor>singletonList(new ScriptStringArgs_Editor());
      case 66:
        return Collections.<ConceptEditor>singletonList(new String_Editor());
      case 67:
        return Collections.<ConceptEditor>singletonList(new StringChannel_Editor());
      case 68:
        return Collections.<ConceptEditor>singletonList(new StringElement_Editor());
      case 69:
        return Collections.<ConceptEditor>singletonList(new TimeAllowed_Editor());
      case 70:
        return Collections.<ConceptEditor>singletonList(new ToList_Editor());
      case 71:
        return Collections.<ConceptEditor>singletonList(new ToSortedList_Editor());
      case 72:
        return Collections.<ConceptEditor>singletonList(new Tuple_Editor());
      case 73:
        return Collections.<ConceptEditor>singletonList(new TupleChannel_Editor());
      case 74:
        return Collections.<ConceptEditor>singletonList(new TupleList_Editor());
      case 75:
        return Collections.<ConceptEditor>singletonList(new TupleListChannel_Editor());
      case 76:
        return Collections.<ConceptEditor>singletonList(new ValueInAChannelRef_Editor());
      case 77:
        return Collections.<ConceptEditor>singletonList(new Workflow_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }
  public Collection<ConceptEditorComponent> getEditorComponents(ConceptDescriptor descriptor, String editorComponentId) {
    return Collections.<ConceptEditorComponent>emptyList();
  }


  private static String[] stringSwitchCases_xbvbvu_a0a0b = new String[]{"org.campagnelab.workflow.structure.BaseLanguageAdapter", "org.campagnelab.workflow.structure.Boolean", "org.campagnelab.workflow.structure.BooleanChannel", "org.campagnelab.workflow.structure.BooleanElement", "org.campagnelab.workflow.structure.ChannelType", "org.campagnelab.workflow.structure.ClusterOptions", "org.campagnelab.workflow.structure.Collate", "org.campagnelab.workflow.structure.ConditionalExpressionText", "org.campagnelab.workflow.structure.ConditionalVariableRef", "org.campagnelab.workflow.structure.File", "org.campagnelab.workflow.structure.FileChannel", "org.campagnelab.workflow.structure.FileList", "org.campagnelab.workflow.structure.FileListChannel", "org.campagnelab.workflow.structure.Flatten", "org.campagnelab.workflow.structure.GlobalBooleanExpression", "org.campagnelab.workflow.structure.GlobalBooleanLiteral", "org.campagnelab.workflow.structure.GlobalBooleanLiteralList", "org.campagnelab.workflow.structure.GlobalBooleanLiteralTuple", "org.campagnelab.workflow.structure.GlobalChannel", "org.campagnelab.workflow.structure.GlobalFileExpression", "org.campagnelab.workflow.structure.GlobalFileListExpression", "org.campagnelab.workflow.structure.GlobalFileLiteralList", "org.campagnelab.workflow.structure.GlobalFileLiteralTuple", "org.campagnelab.workflow.structure.GlobalFilePath", "org.campagnelab.workflow.structure.GlobalIntegerExpression", "org.campagnelab.workflow.structure.GlobalIntegerLiteral", "org.campagnelab.workflow.structure.GlobalIntegerLiteralList", "org.campagnelab.workflow.structure.GlobalIntegerLiteralTuple", "org.campagnelab.workflow.structure.GlobalListExpression", "org.campagnelab.workflow.structure.GlobalListLiteral", "org.campagnelab.workflow.structure.GlobalListLiteralTuple", "org.campagnelab.workflow.structure.GlobalStringExpression", "org.campagnelab.workflow.structure.GlobalStringLiteral", "org.campagnelab.workflow.structure.GlobalStringLiteralList", "org.campagnelab.workflow.structure.GlobalStringLiteralTuple", "org.campagnelab.workflow.structure.GlobalTupleExpression", "org.campagnelab.workflow.structure.GlobalTupleListExpression", "org.campagnelab.workflow.structure.GlobalTupleListLiteral", "org.campagnelab.workflow.structure.GlobalTupleLiteral", "org.campagnelab.workflow.structure.Ignore", "org.campagnelab.workflow.structure.InputChannel", "org.campagnelab.workflow.structure.Integer", "org.campagnelab.workflow.structure.IntegerChannel", "org.campagnelab.workflow.structure.IntegerElement", "org.campagnelab.workflow.structure.List", "org.campagnelab.workflow.structure.ListChannel", "org.campagnelab.workflow.structure.ListElement", "org.campagnelab.workflow.structure.Local", "org.campagnelab.workflow.structure.Memory", "org.campagnelab.workflow.structure.NextflowConfig", "org.campagnelab.workflow.structure.NumCPUs", "org.campagnelab.workflow.structure.OutputChannel", "org.campagnelab.workflow.structure.Penv", "org.campagnelab.workflow.structure.Process", "org.campagnelab.workflow.structure.ProcessRef", "org.campagnelab.workflow.structure.Queue", "org.campagnelab.workflow.structure.QueueElement", "org.campagnelab.workflow.structure.RangeOfCharLiterals", "org.campagnelab.workflow.structure.RangeOfIntegerLiterals", "org.campagnelab.workflow.structure.Retry", "org.campagnelab.workflow.structure.RichScript", "org.campagnelab.workflow.structure.SGE", "org.campagnelab.workflow.structure.ScriptBooleanArgs", "org.campagnelab.workflow.structure.ScriptIntegerArgs", "org.campagnelab.workflow.structure.ScriptListArgs", "org.campagnelab.workflow.structure.ScriptStringArgs", "org.campagnelab.workflow.structure.String", "org.campagnelab.workflow.structure.StringChannel", "org.campagnelab.workflow.structure.StringElement", "org.campagnelab.workflow.structure.TimeAllowed", "org.campagnelab.workflow.structure.ToList", "org.campagnelab.workflow.structure.ToSortedList", "org.campagnelab.workflow.structure.Tuple", "org.campagnelab.workflow.structure.TupleChannel", "org.campagnelab.workflow.structure.TupleList", "org.campagnelab.workflow.structure.TupleListChannel", "org.campagnelab.workflow.structure.ValueInAChannelRef", "org.campagnelab.workflow.structure.Workflow"};
}
