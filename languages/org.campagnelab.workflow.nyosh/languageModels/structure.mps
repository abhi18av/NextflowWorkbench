<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:36d353e8-689e-4297-b8ea-7712719668fa(org.campagnelab.workflow.nyosh.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="dzk5" ref="r:2bfcc546-5c51-4762-9df2-c43920be4458(org.campagnelab.gobyweb.plugins.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="87nw" ref="r:ca2ab6bb-f6e7-4c0f-a88c-b78b9b31fff3(de.slisson.mps.richtext.structure)" implicit="true" />
    <import index="6pk0" ref="r:48f4e449-1a18-435e-ae88-4830aa794dc7(org.campagnelab.nyosh.environment.structure)" implicit="true" />
    <import index="440p" ref="r:a6c7903c-0b83-4bcf-8e49-8f150f2412bf(org.campagnelab.nyosh.interactive.structure)" implicit="true" />
    <import index="iowz" ref="r:0583c0e9-dc14-4152-95a4-93036dce931b(org.campagnelab.workflow.structure)" implicit="true" />
    <import index="935h" ref="r:c68a8ced-fbf7-48e1-b1e0-40266e57501f(org.campagnelab.gobyweb.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="4628067390765907488" name="conceptShortDescription" index="R4oN_" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="7zzYAmTrTrU">
    <property role="TrG5h" value="FixRenamePlan" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="G5bxgNBxbO" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="instructions" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" to="440p:G5bxgNAQ$7" resolve="RenameFileInstruction" />
    </node>
    <node concept="1TJgyi" id="4YJHQQrQuzp" role="1TKVEl">
      <property role="TrG5h" value="test" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="PrWs8" id="4YJHQQrZht9" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="4HNd3hiUKIF">
    <property role="TrG5h" value="ExplicitFileBagRef" />
    <property role="34LRSv" value="files from a setOfBags" />
    <ref role="1TJDcQ" to="iowz:3m26PihlgQQ" resolve="GlobalFileExpression" />
    <node concept="1TJgyj" id="4HNd3hiUKXQ" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="ExplicitFileBag" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" to="440p:4PxeyvB$uiJ" resolve="ExplicitFileBag" />
    </node>
  </node>
  <node concept="1TIwiD" id="irqYu7hsBO">
    <property role="TrG5h" value="NyoShEnvVariableRef" />
    <property role="34LRSv" value="$" />
    <property role="R4oN_" value="reference a GobyWeb resource variable declaration" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="irqYu7hsBP" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="variable" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" to="6pk0:5a_m_wWNCiv" resolve="EnvVariableDeclaration" />
    </node>
    <node concept="PrWs8" id="irqYu7m55d" role="PzmwI">
      <ref role="PrY4T" to="87nw:2dWzqxEBBFG" resolve="IWord" />
    </node>
  </node>
  <node concept="1TIwiD" id="5yyd2HFS3xA">
    <property role="TrG5h" value="NyoShAwareScript" />
    <property role="34LRSv" value="nyosh script" />
    <property role="R4oN_" value="A script that can request installation of NYoSh/GobyWeb resources and their artifacts" />
    <ref role="1TJDcQ" to="iowz:70dPcAeBye8" resolve="RichScript" />
    <node concept="1TJgyj" id="5yyd2HFS3y2" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="requires" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" to="dzk5:1ORG9zeKa86" resolve="ResourceRef" />
    </node>
    <node concept="1TJgyj" id="irqYu7hH$B" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="availableVariables" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" to="6pk0:5a_m_wWNCiv" resolve="EnvVariableDeclaration" />
    </node>
    <node concept="1TJgyj" id="irqYu7ln2W" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="pluginSystemRootDirectory" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" to="935h:5XBY1KyMxak" resolve="PluginSystemRootDirectory" />
    </node>
    <node concept="PrWs8" id="irqYu7mnNv" role="PzmwI">
      <ref role="PrY4T" to="tpck:3fifI_xCcJN" resolve="ScopeProvider" />
    </node>
  </node>
  <node concept="1TIwiD" id="6z79YplEcXu">
    <property role="TrG5h" value="CreateSpace" />
    <property role="19KtqR" value="true" />
    <property role="34LRSv" value="createSpace" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="6z79YplEcXy" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6z79YplEdcG" role="1TKVEl">
      <property role="TrG5h" value="outputValue" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="6z79YplEdcC" role="1TKVEl">
      <property role="TrG5h" value="inputVal" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
</model>

