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
        return Collections.<ConceptEditor>singletonList(new Boolean_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new BooleanChannel_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new BooleanElement_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ClusterOptions_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Collate_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new ConditionalScript_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new File_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new FileChannel_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Flatten_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new InputChannel_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Integer_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new IntegerChannel_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new IntegerElement_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new List_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new ListChannel_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new Local_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new Memory_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new NextflowConfig_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new NumCPUs_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new OutputChannel_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new Penv_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new Process_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new ProcessRef_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new Queue_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new RichScript_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new SGE_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new ScriptBooleanArgs_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new ScriptIntegerArgs_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new ScriptListArgs_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new ScriptStringArgs_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new String_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new StringChannel_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new StringElement_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new TimeAllowed_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new ToList_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new ToSortedList_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new Tuple_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new TupleChannel_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new ValueFromWorkflowRef_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new ValueInAChannelRef_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new Workflow_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new WorkflowBoolean_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new WorkflowInteger_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new WorkflowList_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new WorkflowString_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }
  public Collection<ConceptEditorComponent> getEditorComponents(ConceptDescriptor descriptor, String editorComponentId) {
    return Collections.<ConceptEditorComponent>emptyList();
  }


  private static String[] stringSwitchCases_xbvbvu_a0a0b = new String[]{"org.campagnelab.workflow.structure.Boolean", "org.campagnelab.workflow.structure.BooleanChannel", "org.campagnelab.workflow.structure.BooleanElement", "org.campagnelab.workflow.structure.ClusterOptions", "org.campagnelab.workflow.structure.Collate", "org.campagnelab.workflow.structure.ConditionalScript", "org.campagnelab.workflow.structure.File", "org.campagnelab.workflow.structure.FileChannel", "org.campagnelab.workflow.structure.Flatten", "org.campagnelab.workflow.structure.InputChannel", "org.campagnelab.workflow.structure.Integer", "org.campagnelab.workflow.structure.IntegerChannel", "org.campagnelab.workflow.structure.IntegerElement", "org.campagnelab.workflow.structure.List", "org.campagnelab.workflow.structure.ListChannel", "org.campagnelab.workflow.structure.Local", "org.campagnelab.workflow.structure.Memory", "org.campagnelab.workflow.structure.NextflowConfig", "org.campagnelab.workflow.structure.NumCPUs", "org.campagnelab.workflow.structure.OutputChannel", "org.campagnelab.workflow.structure.Penv", "org.campagnelab.workflow.structure.Process", "org.campagnelab.workflow.structure.ProcessRef", "org.campagnelab.workflow.structure.Queue", "org.campagnelab.workflow.structure.RichScript", "org.campagnelab.workflow.structure.SGE", "org.campagnelab.workflow.structure.ScriptBooleanArgs", "org.campagnelab.workflow.structure.ScriptIntegerArgs", "org.campagnelab.workflow.structure.ScriptListArgs", "org.campagnelab.workflow.structure.ScriptStringArgs", "org.campagnelab.workflow.structure.String", "org.campagnelab.workflow.structure.StringChannel", "org.campagnelab.workflow.structure.StringElement", "org.campagnelab.workflow.structure.TimeAllowed", "org.campagnelab.workflow.structure.ToList", "org.campagnelab.workflow.structure.ToSortedList", "org.campagnelab.workflow.structure.Tuple", "org.campagnelab.workflow.structure.TupleChannel", "org.campagnelab.workflow.structure.ValueFromWorkflowRef", "org.campagnelab.workflow.structure.ValueInAChannelRef", "org.campagnelab.workflow.structure.Workflow", "org.campagnelab.workflow.structure.WorkflowBoolean", "org.campagnelab.workflow.structure.WorkflowInteger", "org.campagnelab.workflow.structure.WorkflowList", "org.campagnelab.workflow.structure.WorkflowString"};
}
