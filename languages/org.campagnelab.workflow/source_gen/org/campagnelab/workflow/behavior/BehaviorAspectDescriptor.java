package org.campagnelab.workflow.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }
  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 41:
        return new Process_BehaviorDescriptor();
      case 64:
        return new Workflow_BehaviorDescriptor();
      case 42:
        return new ProcessRef_BehaviorDescriptor();
      case 54:
        return new String_BehaviorDescriptor();
      case 7:
        return new File_BehaviorDescriptor();
      case 29:
        return new Integer_BehaviorDescriptor();
      case 0:
        return new Boolean_BehaviorDescriptor();
      case 28:
        return new InputChannel_BehaviorDescriptor();
      case 55:
        return new StringChannel_BehaviorDescriptor();
      case 30:
        return new IntegerChannel_BehaviorDescriptor();
      case 1:
        return new BooleanChannel_BehaviorDescriptor();
      case 8:
        return new FileChannel_BehaviorDescriptor();
      case 39:
        return new OutputChannel_BehaviorDescriptor();
      case 53:
        return new ScriptStringArgs_BehaviorDescriptor();
      case 51:
        return new ScriptIntegerArgs_BehaviorDescriptor();
      case 50:
        return new ScriptBooleanArgs_BehaviorDescriptor();
      case 48:
        return new RichScript_BehaviorDescriptor();
      case 63:
        return new ValueInAChannelRef_BehaviorDescriptor();
      case 32:
        return new List_BehaviorDescriptor();
      case 33:
        return new ListChannel_BehaviorDescriptor();
      case 60:
        return new Tuple_BehaviorDescriptor();
      case 61:
        return new TupleChannel_BehaviorDescriptor();
      case 52:
        return new ScriptListArgs_BehaviorDescriptor();
      case 31:
        return new IntegerElement_BehaviorDescriptor();
      case 56:
        return new StringElement_BehaviorDescriptor();
      case 2:
        return new BooleanElement_BehaviorDescriptor();
      case 4:
        return new Collate_BehaviorDescriptor();
      case 9:
        return new Flatten_BehaviorDescriptor();
      case 58:
        return new ToList_BehaviorDescriptor();
      case 59:
        return new ToSortedList_BehaviorDescriptor();
      case 62:
        return new ValueFromWorkflowRef_BehaviorDescriptor();
      case 65:
        return new WorkflowBoolean_BehaviorDescriptor();
      case 68:
        return new WorkflowString_BehaviorDescriptor();
      case 66:
        return new WorkflowInteger_BehaviorDescriptor();
      case 67:
        return new WorkflowList_BehaviorDescriptor();
      case 35:
        return new Local_BehaviorDescriptor();
      case 49:
        return new SGE_BehaviorDescriptor();
      case 38:
        return new NumCPUs_BehaviorDescriptor();
      case 43:
        return new Queue_BehaviorDescriptor();
      case 36:
        return new Memory_BehaviorDescriptor();
      case 40:
        return new Penv_BehaviorDescriptor();
      case 57:
        return new TimeAllowed_BehaviorDescriptor();
      case 3:
        return new ClusterOptions_BehaviorDescriptor();
      case 37:
        return new NextflowConfig_BehaviorDescriptor();
      case 27:
        return new Ignore_BehaviorDescriptor();
      case 47:
        return new Retry_BehaviorDescriptor();
      case 44:
        return new QueueElement_BehaviorDescriptor();
      case 13:
        return new GlobalChannel_BehaviorDescriptor();
      case 34:
        return new ListElement_BehaviorDescriptor();
      case 45:
        return new RangeOfChars_BehaviorDescriptor();
      case 11:
        return new GlobalBooleanExpression_BehaviorDescriptor();
      case 17:
        return new GlobalIntegerExpression_BehaviorDescriptor();
      case 24:
        return new GlobalStringExpression_BehaviorDescriptor();
      case 20:
        return new GlobalListExpression_BehaviorDescriptor();
      case 14:
        return new GlobalFileExpression_BehaviorDescriptor();
      case 10:
        return new GlobalBoolean_BehaviorDescriptor();
      case 25:
        return new GlobalStringList_BehaviorDescriptor();
      case 18:
        return new GlobalIntegerList_BehaviorDescriptor();
      case 12:
        return new GlobalBooleanList_BehaviorDescriptor();
      case 15:
        return new GlobalFileList_BehaviorDescriptor();
      case 19:
        return new GlobalList_BehaviorDescriptor();
      case 23:
        return new GlobalString_BehaviorDescriptor();
      case 46:
        return new RangeOfIntegers_BehaviorDescriptor();
      case 16:
        return new GlobalInteger_BehaviorDescriptor();
      case 5:
        return new ConditionalScript_BehaviorDescriptor();
      case 26:
        return new IfCondition_BehaviorDescriptor();
      case 6:
        return new ElseCondition_BehaviorDescriptor();
      case 21:
        return new GlobalLocalFile_BehaviorDescriptor();
      case 22:
        return new GlobalRemoteFile_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"org.campagnelab.workflow.structure.Boolean", "org.campagnelab.workflow.structure.BooleanChannel", "org.campagnelab.workflow.structure.BooleanElement", "org.campagnelab.workflow.structure.ClusterOptions", "org.campagnelab.workflow.structure.Collate", "org.campagnelab.workflow.structure.ConditionalScript", "org.campagnelab.workflow.structure.ElseCondition", "org.campagnelab.workflow.structure.File", "org.campagnelab.workflow.structure.FileChannel", "org.campagnelab.workflow.structure.Flatten", "org.campagnelab.workflow.structure.GlobalBoolean", "org.campagnelab.workflow.structure.GlobalBooleanExpression", "org.campagnelab.workflow.structure.GlobalBooleanList", "org.campagnelab.workflow.structure.GlobalChannel", "org.campagnelab.workflow.structure.GlobalFileExpression", "org.campagnelab.workflow.structure.GlobalFileList", "org.campagnelab.workflow.structure.GlobalInteger", "org.campagnelab.workflow.structure.GlobalIntegerExpression", "org.campagnelab.workflow.structure.GlobalIntegerList", "org.campagnelab.workflow.structure.GlobalList", "org.campagnelab.workflow.structure.GlobalListExpression", "org.campagnelab.workflow.structure.GlobalLocalFile", "org.campagnelab.workflow.structure.GlobalRemoteFile", "org.campagnelab.workflow.structure.GlobalString", "org.campagnelab.workflow.structure.GlobalStringExpression", "org.campagnelab.workflow.structure.GlobalStringList", "org.campagnelab.workflow.structure.IfCondition", "org.campagnelab.workflow.structure.Ignore", "org.campagnelab.workflow.structure.InputChannel", "org.campagnelab.workflow.structure.Integer", "org.campagnelab.workflow.structure.IntegerChannel", "org.campagnelab.workflow.structure.IntegerElement", "org.campagnelab.workflow.structure.List", "org.campagnelab.workflow.structure.ListChannel", "org.campagnelab.workflow.structure.ListElement", "org.campagnelab.workflow.structure.Local", "org.campagnelab.workflow.structure.Memory", "org.campagnelab.workflow.structure.NextflowConfig", "org.campagnelab.workflow.structure.NumCPUs", "org.campagnelab.workflow.structure.OutputChannel", "org.campagnelab.workflow.structure.Penv", "org.campagnelab.workflow.structure.Process", "org.campagnelab.workflow.structure.ProcessRef", "org.campagnelab.workflow.structure.Queue", "org.campagnelab.workflow.structure.QueueElement", "org.campagnelab.workflow.structure.RangeOfChars", "org.campagnelab.workflow.structure.RangeOfIntegers", "org.campagnelab.workflow.structure.Retry", "org.campagnelab.workflow.structure.RichScript", "org.campagnelab.workflow.structure.SGE", "org.campagnelab.workflow.structure.ScriptBooleanArgs", "org.campagnelab.workflow.structure.ScriptIntegerArgs", "org.campagnelab.workflow.structure.ScriptListArgs", "org.campagnelab.workflow.structure.ScriptStringArgs", "org.campagnelab.workflow.structure.String", "org.campagnelab.workflow.structure.StringChannel", "org.campagnelab.workflow.structure.StringElement", "org.campagnelab.workflow.structure.TimeAllowed", "org.campagnelab.workflow.structure.ToList", "org.campagnelab.workflow.structure.ToSortedList", "org.campagnelab.workflow.structure.Tuple", "org.campagnelab.workflow.structure.TupleChannel", "org.campagnelab.workflow.structure.ValueFromWorkflowRef", "org.campagnelab.workflow.structure.ValueInAChannelRef", "org.campagnelab.workflow.structure.Workflow", "org.campagnelab.workflow.structure.WorkflowBoolean", "org.campagnelab.workflow.structure.WorkflowInteger", "org.campagnelab.workflow.structure.WorkflowList", "org.campagnelab.workflow.structure.WorkflowString"};
}
