<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:9d9d621c-3647-4e16-ae2a-8f3d3a84a01c(constants)">
  <persistence version="9" />
  <languages>
    <use id="c6c823fb-a9da-46e7-9850-129b0f7a7aa5" name="org.campagnelab.workflow" version="6" />
    <devkit ref="74a4431b-c31f-4707-ad8a-3f4f3c105ee2(org.campagnelab.NextflowWorkbench)" />
  </languages>
  <imports>
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
    </language>
    <language id="92d2ea16-5a42-4fdf-a676-c7604efe3504" name="de.slisson.mps.richtext">
      <concept id="2557074442922380897" name="de.slisson.mps.richtext.structure.Text" flags="ng" index="19SGf9">
        <child id="2557074442922392302" name="words" index="19SJt6" />
      </concept>
      <concept id="2557074442922438156" name="de.slisson.mps.richtext.structure.Word" flags="ng" index="19SUe$">
        <property id="2557074442922438158" name="escapedValue" index="19SUeA" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="f9b7dda6-7ab5-4936-ad1b-2d45c57833dc" name="org.campagnelab.workflow.configuration">
      <concept id="6643674795001677795" name="org.campagnelab.workflow.configuration.structure.WorkflowConfig" flags="ng" index="3zupj_">
        <child id="6643674795001677796" name="executor" index="3zupjy" />
      </concept>
      <concept id="6643674795001609832" name="org.campagnelab.workflow.configuration.structure.Local" flags="ng" index="3zuAPI" />
    </language>
    <language id="c6c823fb-a9da-46e7-9850-129b0f7a7aa5" name="org.campagnelab.workflow">
      <concept id="5954930966410664724" name="org.campagnelab.workflow.structure.HasExpression" flags="ng" index="20hr4X">
        <child id="5954930966410666282" name="expression" index="20hoG3" />
      </concept>
      <concept id="8528134073268331577" name="org.campagnelab.workflow.structure.ConstantExpression" flags="ng" index="4iA3S">
        <child id="8528134073268547180" name="expression" index="4iqEH" />
      </concept>
      <concept id="4018964125401495568" name="org.campagnelab.workflow.structure.Tuple" flags="ng" index="knwa4">
        <child id="7391172440899058539" name="elements" index="2zSOd7" />
      </concept>
      <concept id="2590112629724566341" name="org.campagnelab.workflow.structure.InputValue" flags="ng" index="2l3rVN">
        <reference id="2590112629724567366" name="input" index="2l3rFK" />
      </concept>
      <concept id="2590112629719316315" name="org.campagnelab.workflow.structure.OutputExpression" flags="ng" index="2lntFH">
        <child id="2590112629719316376" name="expression" index="2lntCI" />
      </concept>
      <concept id="2590112629708723516" name="org.campagnelab.workflow.structure.ProcessOutput" flags="ng" index="2lYRya" />
      <concept id="2590112629703806958" name="org.campagnelab.workflow.structure.ProcessInput" flags="ng" index="2mjA9o" />
      <concept id="7457140171610904753" name="org.campagnelab.workflow.structure.Process" flags="ng" index="2ulcR8">
        <child id="7457140171610928304" name="outputs" index="2ulM79" />
        <child id="7457140171610928307" name="script" index="2ulM7a" />
        <child id="7457140171610928302" name="inputs" index="2ulM7n" />
      </concept>
      <concept id="7391172440898975896" name="org.campagnelab.workflow.structure.TupleElement" flags="ng" index="2zSw2O" />
      <concept id="6505336652526334578" name="org.campagnelab.workflow.structure.ProcessRef" flags="ng" index="2$rEH5">
        <reference id="6505336652526334579" name="process" index="2$rEH4" />
        <child id="8369613327464344476" name="outChannel" index="1uLvPA" />
        <child id="8369613327464344471" name="inChannel" index="1uLvPH" />
      </concept>
      <concept id="6505336652526301852" name="org.campagnelab.workflow.structure.Workflow" flags="ng" index="2$rMIF">
        <child id="6505336652526334573" name="processes" index="2$rEHq" />
        <child id="3855674281011085290" name="globalChannels" index="2$L6iY" />
        <child id="6588488528863130400" name="reports" index="2UW718" />
      </concept>
      <concept id="3653684473245054612" name="org.campagnelab.workflow.structure.NewIntegerLiteral" flags="ng" index="2J_swZ">
        <property id="3653684473245054659" name="value" index="2J_sxC" />
      </concept>
      <concept id="3653684473245054700" name="org.campagnelab.workflow.structure.NewListLiteral" flags="ng" index="2J_sx7">
        <child id="3653684473245054701" name="elementType" index="2J_sx6" />
      </concept>
      <concept id="6588488528863172354" name="org.campagnelab.workflow.structure.Report" flags="ng" index="2UNLhE">
        <reference id="6588488528863172372" name="channel" index="2UNLhW" />
        <child id="6588488528863172374" name="function" index="2UNLhY" />
      </concept>
      <concept id="6588488528864881600" name="org.campagnelab.workflow.structure.ReportFunction" flags="ig" index="2UPiyC" />
      <concept id="6588488528864881603" name="org.campagnelab.workflow.structure.ReportParameter" flags="ng" index="2UPiyF" />
      <concept id="4873360496324422473" name="org.campagnelab.workflow.structure.Integer" flags="ng" index="1utKN4" />
      <concept id="8369613327464373434" name="org.campagnelab.workflow.structure.OutputChannel" flags="ng" index="1uLkD0" />
      <concept id="8369613327464344274" name="org.campagnelab.workflow.structure.ProcessInputOutput" flags="ng" index="1uLvKC">
        <child id="7391172440887133304" name="type" index="2ybFLk" />
      </concept>
      <concept id="8369613327464009594" name="org.campagnelab.workflow.structure.InputChannel" flags="ng" index="1uYdA0">
        <reference id="8369613327464433607" name="connectedTo" index="1uK_4X" />
      </concept>
      <concept id="6456103554942004322" name="org.campagnelab.workflow.structure.GlobalChannel" flags="ng" index="1CVceo">
        <child id="3855674281011084282" name="value" index="2$L62I" />
      </concept>
      <concept id="8074343669091410824" name="org.campagnelab.workflow.structure.RichScript" flags="ng" index="3Y$Zt1">
        <child id="8074343669091434993" name="text" index="3Y$PkS" />
      </concept>
      <concept id="8074343669091902386" name="org.campagnelab.workflow.structure.ValueInAChannelRef" flags="ng" index="3YE7tV">
        <reference id="8074343669091902431" name="value" index="3YE7sm" />
      </concept>
    </language>
  </registry>
  <node concept="2ulcR8" id="7pq1c5MfvYA">
    <property role="TrG5h" value="AcceptsTwoInts" />
    <node concept="2lYRya" id="7pq1c5MfZPC" role="2ulM79">
      <node concept="knwa4" id="7pq1c5MfZPK" role="2ybFLk">
        <node concept="2zSw2O" id="7pq1c5MfZPM" role="2zSOd7">
          <property role="TrG5h" value="a" />
          <node concept="1utKN4" id="7pq1c5MfZQ6" role="2ybFLk" />
          <node concept="2lntFH" id="7pq1c5MfZSb" role="20hoG3">
            <node concept="2l3rVN" id="7pq1c5MfZSE" role="2lntCI">
              <ref role="2l3rFK" node="7pq1c5MfvYF" resolve="a" />
            </node>
          </node>
        </node>
        <node concept="2zSw2O" id="7pq1c5MfZQp" role="2zSOd7">
          <property role="TrG5h" value="b" />
          <node concept="1utKN4" id="7pq1c5MfZQR" role="2ybFLk" />
          <node concept="2lntFH" id="7pq1c5MfZSJ" role="20hoG3">
            <node concept="2l3rVN" id="7pq1c5MfZTe" role="2lntCI">
              <ref role="2l3rFK" node="7pq1c5MfvZ0" resolve="b" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2mjA9o" id="7pq1c5MfvYF" role="2ulM7n">
      <property role="TrG5h" value="a" />
      <node concept="1utKN4" id="7pq1c5MfvYN" role="2ybFLk" />
    </node>
    <node concept="2mjA9o" id="7pq1c5MfvZ0" role="2ulM7n">
      <property role="TrG5h" value="b" />
      <node concept="1utKN4" id="7pq1c5MfvZa" role="2ybFLk" />
    </node>
    <node concept="3Y$Zt1" id="7pq1c5MfvZn" role="2ulM7a">
      <node concept="19SGf9" id="7pq1c5MfvZp" role="3Y$PkS">
        <node concept="19SUe$" id="7pq1c5MfvZq" role="19SJt6">
          <property role="19SUeA" value=" echo " />
        </node>
        <node concept="3YE7tV" id="7pq1c5MfvZv" role="19SJt6">
          <ref role="3YE7sm" node="7pq1c5MfvYF" resolve="a" />
        </node>
        <node concept="19SUe$" id="7pq1c5MfvZD" role="19SJt6">
          <property role="19SUeA" value=" " />
        </node>
        <node concept="3YE7tV" id="7pq1c5MfvZJ" role="19SJt6">
          <ref role="3YE7sm" node="7pq1c5MfvZ0" resolve="b" />
        </node>
        <node concept="19SUe$" id="7pq1c5MfvZK" role="19SJt6">
          <property role="19SUeA" value="" />
        </node>
      </node>
    </node>
  </node>
  <node concept="2$rMIF" id="7pq1c5Mfv_d">
    <property role="TrG5h" value="WorkflowWithConstants" />
    <node concept="2UNLhE" id="7pq1c5Mg03A" role="2UW718">
      <ref role="2UNLhW" node="7pq1c5MfZUk" resolve="ou34t" />
      <node concept="2UPiyC" id="7pq1c5Mg03B" role="2UNLhY">
        <node concept="3clFbS" id="7pq1c5Mg03C" role="2VODD2">
          <node concept="3clFbF" id="53yaZUNe9P5" role="3cqZAp">
            <node concept="2OqwBi" id="53yaZUNe9P2" role="3clFbG">
              <node concept="10M0yZ" id="53yaZUNe9P3" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="53yaZUNe9P4" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.Object):void" resolve="println" />
                <node concept="2UPiyF" id="53yaZUNe9Qf" role="37wK5m" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1CVceo" id="7pq1c5MfvAx" role="2$L6iY">
      <property role="TrG5h" value="ints" />
      <node concept="2J_sx7" id="7pq1c5MfvAy" role="2$L62I">
        <node concept="2J_swZ" id="7pq1c5MfvJA" role="2J_sx6">
          <property role="2J_sxC" value="1" />
        </node>
        <node concept="2J_swZ" id="7pq1c5MfvJF" role="2J_sx6">
          <property role="2J_sxC" value="2" />
        </node>
        <node concept="2J_swZ" id="7pq1c5MfvKj" role="2J_sx6">
          <property role="2J_sxC" value="3" />
        </node>
      </node>
    </node>
    <node concept="1CVceo" id="53yaZUNcfly" role="2$L6iY">
      <property role="TrG5h" value="one" />
      <node concept="4iA3S" id="53yaZUNcfxb" role="2$L62I">
        <node concept="2J_swZ" id="53yaZUNcfyd" role="4iqEH">
          <property role="2J_sxC" value="99" />
        </node>
      </node>
    </node>
    <node concept="2$rEH5" id="7pq1c5MfvWU" role="2$rEHq">
      <ref role="2$rEH4" node="7pq1c5MfvYA" resolve="AcceptsTwoInts" />
      <node concept="1uLkD0" id="7pq1c5MfZUk" role="1uLvPA">
        <property role="TrG5h" value="ou34t" />
      </node>
      <node concept="1uYdA0" id="7pq1c5MfvWV" role="1uLvPH">
        <ref role="1uK_4X" node="7pq1c5MfvAx" resolve="ints" />
      </node>
      <node concept="1uYdA0" id="7pq1c5Mfw0l" role="1uLvPH">
        <ref role="1uK_4X" node="53yaZUNcfly" resolve="one" />
      </node>
    </node>
  </node>
  <node concept="3zupj_" id="7pq1c5MfvAs">
    <property role="TrG5h" value="workflow.config" />
    <node concept="3zuAPI" id="7pq1c5MfvAt" role="3zupjy" />
  </node>
</model>

