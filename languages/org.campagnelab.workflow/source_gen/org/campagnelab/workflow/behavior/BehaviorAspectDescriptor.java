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
      case 73:
        return new Process_BehaviorDescriptor();
      case 121:
        return new Workflow_BehaviorDescriptor();
      case 75:
        return new ProcessRef_BehaviorDescriptor();
      case 99:
        return new String_BehaviorDescriptor();
      case 20:
        return new File_BehaviorDescriptor();
      case 40:
        return new Integer_BehaviorDescriptor();
      case 1:
        return new Boolean_BehaviorDescriptor();
      case 39:
        return new InputChannel_BehaviorDescriptor();
      case 100:
        return new StringChannel_BehaviorDescriptor();
      case 41:
        return new IntegerChannel_BehaviorDescriptor();
      case 2:
        return new BooleanChannel_BehaviorDescriptor();
      case 21:
        return new FileChannel_BehaviorDescriptor();
      case 74:
        return new ProcessInputOutput_BehaviorDescriptor();
      case 70:
        return new OutputChannel_BehaviorDescriptor();
      case 93:
        return new ScriptStringArgs_BehaviorDescriptor();
      case 91:
        return new ScriptIntegerArgs_BehaviorDescriptor();
      case 90:
        return new ScriptBooleanArgs_BehaviorDescriptor();
      case 88:
        return new RichScript_BehaviorDescriptor();
      case 120:
        return new ValueInAChannelRef_BehaviorDescriptor();
      case 52:
        return new List_BehaviorDescriptor();
      case 53:
        return new ListChannel_BehaviorDescriptor();
      case 112:
        return new TupleChannel_BehaviorDescriptor();
      case 92:
        return new ScriptListArgs_BehaviorDescriptor();
      case 42:
        return new IntegerElement_BehaviorDescriptor();
      case 101:
        return new StringElement_BehaviorDescriptor();
      case 3:
        return new BooleanElement_BehaviorDescriptor();
      case 12:
        return new Collate_BehaviorDescriptor();
      case 33:
        return new Flatten_BehaviorDescriptor();
      case 108:
        return new ToList_BehaviorDescriptor();
      case 109:
        return new ToSortedList_BehaviorDescriptor();
      case 58:
        return new Local_BehaviorDescriptor();
      case 89:
        return new SGE_BehaviorDescriptor();
      case 69:
        return new NumCPUs_BehaviorDescriptor();
      case 76:
        return new Queue_BehaviorDescriptor();
      case 60:
        return new Memory_BehaviorDescriptor();
      case 72:
        return new Penv_BehaviorDescriptor();
      case 107:
        return new TimeAllowed_BehaviorDescriptor();
      case 11:
        return new ClusterOptions_BehaviorDescriptor();
      case 68:
        return new NextflowConfig_BehaviorDescriptor();
      case 38:
        return new Ignore_BehaviorDescriptor();
      case 87:
        return new Retry_BehaviorDescriptor();
      case 77:
        return new QueueElement_BehaviorDescriptor();
      case 34:
        return new GlobalChannel_BehaviorDescriptor();
      case 54:
        return new ListElement_BehaviorDescriptor();
      case 79:
        return new RangeOfCharLiterals_BehaviorDescriptor();
      case 4:
        return new BooleanInitializer_BehaviorDescriptor();
      case 43:
        return new IntegerInitializer_BehaviorDescriptor();
      case 102:
        return new StringInitializer_BehaviorDescriptor();
      case 55:
        return new ListInitializer_BehaviorDescriptor();
      case 22:
        return new FileInitializer_BehaviorDescriptor();
      case 5:
        return new BooleanLiteral_BehaviorDescriptor();
      case 104:
        return new StringLiteralList_BehaviorDescriptor();
      case 45:
        return new IntegerLiteralList_BehaviorDescriptor();
      case 6:
        return new BooleanLiteralList_BehaviorDescriptor();
      case 26:
        return new FileLiteralList_BehaviorDescriptor();
      case 56:
        return new ListLiteral_BehaviorDescriptor();
      case 103:
        return new StringLiteral_BehaviorDescriptor();
      case 80:
        return new RangeOfIntegerLiterals_BehaviorDescriptor();
      case 44:
        return new IntegerLiteral_BehaviorDescriptor();
      case 0:
        return new BaseLanguageAdapter_BehaviorDescriptor();
      case 28:
        return new FilePath_BehaviorDescriptor();
      case 15:
        return new ConditionalExpressionText_BehaviorDescriptor();
      case 16:
        return new ConditionalVariableRef_BehaviorDescriptor();
      case 29:
        return new FileType_BehaviorDescriptor();
      case 9:
        return new ChannelType_BehaviorDescriptor();
      case 111:
        return new Tuple_BehaviorDescriptor();
      case 117:
        return new TupleType_BehaviorDescriptor();
      case 114:
        return new TupleInitializer_BehaviorDescriptor();
      case 7:
        return new BooleanLiteralTuple_BehaviorDescriptor();
      case 116:
        return new TupleLiteral_BehaviorDescriptor();
      case 46:
        return new IntegerLiteralTuple_BehaviorDescriptor();
      case 105:
        return new StringLiteralTuple_BehaviorDescriptor();
      case 27:
        return new FileLiteralTuple_BehaviorDescriptor();
      case 57:
        return new ListLiteralTuple_BehaviorDescriptor();
      case 24:
        return new FileListChannel_BehaviorDescriptor();
      case 23:
        return new FileList_BehaviorDescriptor();
      case 25:
        return new FileListInitializer_BehaviorDescriptor();
      case 14:
        return new CollateStepSize_BehaviorDescriptor();
      case 13:
        return new CollateAllowIncompleteTuples_BehaviorDescriptor();
      case 115:
        return new TupleListLiteral_BehaviorDescriptor();
      case 61:
        return new NameInAChannelRef_BehaviorDescriptor();
      case 83:
        return new RemoteSubmissionConfig_BehaviorDescriptor();
      case 82:
        return new RemoteSetEnv_BehaviorDescriptor();
      case 48:
        return new JobArea_BehaviorDescriptor();
      case 49:
        return new KeyFile_BehaviorDescriptor();
      case 37:
        return new Hostname_BehaviorDescriptor();
      case 119:
        return new Username_BehaviorDescriptor();
      case 84:
        return new Report_BehaviorDescriptor();
      case 86:
        return new ReportParameter_BehaviorDescriptor();
      case 85:
        return new ReportFunction_BehaviorDescriptor();
      case 113:
        return new TupleElement_BehaviorDescriptor();
      case 110:
        return new ToTuple_BehaviorDescriptor();
      case 50:
        return new LSF_BehaviorDescriptor();
      case 94:
        return new Slurm_BehaviorDescriptor();
      case 71:
        return new PBS_BehaviorDescriptor();
      case 18:
        return new DRMAA_BehaviorDescriptor();
      case 10:
        return new Cirrus_BehaviorDescriptor();
      case 17:
        return new DNANexus_BehaviorDescriptor();
      case 78:
        return new Range_BehaviorDescriptor();
      case 66:
        return new NewStringLiteral_BehaviorDescriptor();
      case 67:
        return new NewTupleLiteral_BehaviorDescriptor();
      case 63:
        return new NewFileLiteral_BehaviorDescriptor();
      case 64:
        return new NewIntegerLiteral_BehaviorDescriptor();
      case 65:
        return new NewListLiteral_BehaviorDescriptor();
      case 62:
        return new NewBooleanLiteral_BehaviorDescriptor();
      case 30:
        return new Filter_BehaviorDescriptor();
      case 118:
        return new Unique_BehaviorDescriptor();
      case 19:
        return new Distinct_BehaviorDescriptor();
      case 31:
        return new First_BehaviorDescriptor();
      case 106:
        return new Take_BehaviorDescriptor();
      case 51:
        return new Last_BehaviorDescriptor();
      case 95:
        return new SplitCSV_BehaviorDescriptor();
      case 96:
        return new SplitFasta_BehaviorDescriptor();
      case 97:
        return new SplitFastq_BehaviorDescriptor();
      case 98:
        return new SplitText_BehaviorDescriptor();
      case 59:
        return new Map_BehaviorDescriptor();
      case 32:
        return new FlatMap_BehaviorDescriptor();
      case 81:
        return new Reduce_BehaviorDescriptor();
      case 35:
        return new GroupBy_BehaviorDescriptor();
      case 36:
        return new GroupTuple_BehaviorDescriptor();
      case 8:
        return new Buffer_BehaviorDescriptor();
      case 47:
        return new It_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"org.campagnelab.workflow.structure.BaseLanguageAdapter", "org.campagnelab.workflow.structure.Boolean", "org.campagnelab.workflow.structure.BooleanChannel", "org.campagnelab.workflow.structure.BooleanElement", "org.campagnelab.workflow.structure.BooleanInitializer", "org.campagnelab.workflow.structure.BooleanLiteral", "org.campagnelab.workflow.structure.BooleanLiteralList", "org.campagnelab.workflow.structure.BooleanLiteralTuple", "org.campagnelab.workflow.structure.Buffer", "org.campagnelab.workflow.structure.ChannelType", "org.campagnelab.workflow.structure.Cirrus", "org.campagnelab.workflow.structure.ClusterOptions", "org.campagnelab.workflow.structure.Collate", "org.campagnelab.workflow.structure.CollateAllowIncompleteTuples", "org.campagnelab.workflow.structure.CollateStepSize", "org.campagnelab.workflow.structure.ConditionalExpressionText", "org.campagnelab.workflow.structure.ConditionalVariableRef", "org.campagnelab.workflow.structure.DNANexus", "org.campagnelab.workflow.structure.DRMAA", "org.campagnelab.workflow.structure.Distinct", "org.campagnelab.workflow.structure.File", "org.campagnelab.workflow.structure.FileChannel", "org.campagnelab.workflow.structure.FileInitializer", "org.campagnelab.workflow.structure.FileList", "org.campagnelab.workflow.structure.FileListChannel", "org.campagnelab.workflow.structure.FileListInitializer", "org.campagnelab.workflow.structure.FileLiteralList", "org.campagnelab.workflow.structure.FileLiteralTuple", "org.campagnelab.workflow.structure.FilePath", "org.campagnelab.workflow.structure.FileType", "org.campagnelab.workflow.structure.Filter", "org.campagnelab.workflow.structure.First", "org.campagnelab.workflow.structure.FlatMap", "org.campagnelab.workflow.structure.Flatten", "org.campagnelab.workflow.structure.GlobalChannel", "org.campagnelab.workflow.structure.GroupBy", "org.campagnelab.workflow.structure.GroupTuple", "org.campagnelab.workflow.structure.Hostname", "org.campagnelab.workflow.structure.Ignore", "org.campagnelab.workflow.structure.InputChannel", "org.campagnelab.workflow.structure.Integer", "org.campagnelab.workflow.structure.IntegerChannel", "org.campagnelab.workflow.structure.IntegerElement", "org.campagnelab.workflow.structure.IntegerInitializer", "org.campagnelab.workflow.structure.IntegerLiteral", "org.campagnelab.workflow.structure.IntegerLiteralList", "org.campagnelab.workflow.structure.IntegerLiteralTuple", "org.campagnelab.workflow.structure.It", "org.campagnelab.workflow.structure.JobArea", "org.campagnelab.workflow.structure.KeyFile", "org.campagnelab.workflow.structure.LSF", "org.campagnelab.workflow.structure.Last", "org.campagnelab.workflow.structure.List", "org.campagnelab.workflow.structure.ListChannel", "org.campagnelab.workflow.structure.ListElement", "org.campagnelab.workflow.structure.ListInitializer", "org.campagnelab.workflow.structure.ListLiteral", "org.campagnelab.workflow.structure.ListLiteralTuple", "org.campagnelab.workflow.structure.Local", "org.campagnelab.workflow.structure.Map", "org.campagnelab.workflow.structure.Memory", "org.campagnelab.workflow.structure.NameInAChannelRef", "org.campagnelab.workflow.structure.NewBooleanLiteral", "org.campagnelab.workflow.structure.NewFileLiteral", "org.campagnelab.workflow.structure.NewIntegerLiteral", "org.campagnelab.workflow.structure.NewListLiteral", "org.campagnelab.workflow.structure.NewStringLiteral", "org.campagnelab.workflow.structure.NewTupleLiteral", "org.campagnelab.workflow.structure.NextflowConfig", "org.campagnelab.workflow.structure.NumCPUs", "org.campagnelab.workflow.structure.OutputChannel", "org.campagnelab.workflow.structure.PBS", "org.campagnelab.workflow.structure.Penv", "org.campagnelab.workflow.structure.Process", "org.campagnelab.workflow.structure.ProcessInputOutput", "org.campagnelab.workflow.structure.ProcessRef", "org.campagnelab.workflow.structure.Queue", "org.campagnelab.workflow.structure.QueueElement", "org.campagnelab.workflow.structure.Range", "org.campagnelab.workflow.structure.RangeOfCharLiterals", "org.campagnelab.workflow.structure.RangeOfIntegerLiterals", "org.campagnelab.workflow.structure.Reduce", "org.campagnelab.workflow.structure.RemoteSetEnv", "org.campagnelab.workflow.structure.RemoteSubmissionConfig", "org.campagnelab.workflow.structure.Report", "org.campagnelab.workflow.structure.ReportFunction", "org.campagnelab.workflow.structure.ReportParameter", "org.campagnelab.workflow.structure.Retry", "org.campagnelab.workflow.structure.RichScript", "org.campagnelab.workflow.structure.SGE", "org.campagnelab.workflow.structure.ScriptBooleanArgs", "org.campagnelab.workflow.structure.ScriptIntegerArgs", "org.campagnelab.workflow.structure.ScriptListArgs", "org.campagnelab.workflow.structure.ScriptStringArgs", "org.campagnelab.workflow.structure.Slurm", "org.campagnelab.workflow.structure.SplitCSV", "org.campagnelab.workflow.structure.SplitFasta", "org.campagnelab.workflow.structure.SplitFastq", "org.campagnelab.workflow.structure.SplitText", "org.campagnelab.workflow.structure.String", "org.campagnelab.workflow.structure.StringChannel", "org.campagnelab.workflow.structure.StringElement", "org.campagnelab.workflow.structure.StringInitializer", "org.campagnelab.workflow.structure.StringLiteral", "org.campagnelab.workflow.structure.StringLiteralList", "org.campagnelab.workflow.structure.StringLiteralTuple", "org.campagnelab.workflow.structure.Take", "org.campagnelab.workflow.structure.TimeAllowed", "org.campagnelab.workflow.structure.ToList", "org.campagnelab.workflow.structure.ToSortedList", "org.campagnelab.workflow.structure.ToTuple", "org.campagnelab.workflow.structure.Tuple", "org.campagnelab.workflow.structure.TupleChannel", "org.campagnelab.workflow.structure.TupleElement", "org.campagnelab.workflow.structure.TupleInitializer", "org.campagnelab.workflow.structure.TupleListLiteral", "org.campagnelab.workflow.structure.TupleLiteral", "org.campagnelab.workflow.structure.TupleType", "org.campagnelab.workflow.structure.Unique", "org.campagnelab.workflow.structure.Username", "org.campagnelab.workflow.structure.ValueInAChannelRef", "org.campagnelab.workflow.structure.Workflow"};
}
