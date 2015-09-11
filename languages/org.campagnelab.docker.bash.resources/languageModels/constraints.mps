<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:4a7dc693-8845-4dec-917e-47bf8288e02c(org.campagnelab.bash.nyosh.constraints)">
  <persistence version="9" />
  <languages>
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="6pk0" ref="r:48f4e449-1a18-435e-ae88-4830aa794dc7(org.campagnelab.nyosh.environment.structure)" />
    <import index="iuj9" ref="r:b8fcf1e4-ccc5-4a08-9b19-9b2e4e857cd7(org.campagnelab.bash.nyosh.structure)" />
    <import index="dzk5" ref="r:2bfcc546-5c51-4762-9df2-c43920be4458(org.campagnelab.gobyweb.plugins.structure)" implicit="true" />
    <import index="6na6" ref="r:275bd400-acdb-421f-85dc-681aa38f985b(org.campagnelab.bash.nyosh.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
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
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="1202989531578" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="nKS2y" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="8401916545537438642" name="jetbrains.mps.lang.constraints.structure.InheritedNodeScopeFactory" flags="ng" index="1dDu$B">
        <reference id="8401916545537438643" name="kind" index="1dDu$A" />
      </concept>
      <concept id="1163200368514" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSetHandler" flags="in" index="3k9gUc" />
      <concept id="1163200647017" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode" flags="nn" index="3kakTB" />
      <concept id="1163202640154" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_newReferentNode" flags="nn" index="3khVwk" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1213100494875" name="referent" index="1Mr941" />
        <child id="1213106463729" name="canBeChild" index="1MLUbF" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1163203787401" name="referentSetHandler" index="3kmjI7" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI">
        <reference id="1140138128738" name="concept" index="1PxNhF" />
        <child id="1140138123956" name="leftExpression" index="1PxMeX" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
  </registry>
  <node concept="1M2fIO" id="6A9boVQ8yHp">
    <ref role="1M2myG" to="iuj9:6A9boVQ8yHm" resolve="NYoShEnvVariableRef" />
    <node concept="1N5Pfh" id="6A9boVQ8yHq" role="1Mr941">
      <ref role="1N5Vy1" to="iuj9:6A9boVQ8yHn" />
      <node concept="1dDu$B" id="6A9boVQ8yHr" role="1N6uqs">
        <ref role="1dDu$A" to="6pk0:5a_m_wWNCiv" resolve="EnvVariableDeclaration" />
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="6A9boVQv91m">
    <ref role="1M2myG" to="iuj9:18MzsNNQZvZ" resolve="RequiredResource" />
    <node concept="1N5Pfh" id="6A9boVQvvm_" role="1Mr941">
      <ref role="1N5Vy1" to="dzk5:1ORG9zeKa87" />
      <node concept="3k9gUc" id="6A9boVQvvmH" role="3kmjI7">
        <node concept="3clFbS" id="6A9boVQvvmI" role="2VODD2">
          <node concept="3clFbF" id="6A9boVQvvt6" role="3cqZAp">
            <node concept="37vLTI" id="6A9boVQvvU5" role="3clFbG">
              <node concept="3khVwk" id="6A9boVQvvVR" role="37vLTx" />
              <node concept="2OqwBi" id="6A9boVQvvuB" role="37vLTJ">
                <node concept="3kakTB" id="6A9boVQvvt5" role="2Oq$k0" />
                <node concept="3TrEf2" id="6A9boVQvvBU" role="2OqNvi">
                  <ref role="3Tt5mk" to="dzk5:1ORG9zeKa87" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6A9boVQvw0l" role="3cqZAp">
            <node concept="2OqwBi" id="6A9boVQvw2W" role="3clFbG">
              <node concept="3kakTB" id="6A9boVQvw0j" role="2Oq$k0" />
              <node concept="2qgKlT" id="6A9boVQvwl5" role="2OqNvi">
                <ref role="37wK5l" to="6na6:6A9boVQvvn$" resolve="reloadArtifacts" />
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="6A9boVQyW64" role="3cqZAp">
            <node concept="2OqwBi" id="6A9boVQyXAO" role="3clFbG">
              <node concept="1PxgMI" id="6A9boVQyWBZ" role="2Oq$k0">
                <ref role="1PxNhF" to="iuj9:5yyd2HFS3xA" resolve="NYoShAwareScript" />
                <node concept="2OqwBi" id="6A9boVQyW8U" role="1PxMeX">
                  <node concept="3kakTB" id="6A9boVQyW62" role="2Oq$k0" />
                  <node concept="1mfA1w" id="6A9boVQyWjA" role="2OqNvi" />
                </node>
              </node>
              <node concept="2qgKlT" id="6A9boVQz2lY" role="2OqNvi">
                <ref role="37wK5l" to="6na6:6A9boVQz00N" resolve="addDependencies" />
                <node concept="2OqwBi" id="6A9boVQyVRU" role="37wK5m">
                  <node concept="3kakTB" id="6A9boVQyVPu" role="2Oq$k0" />
                  <node concept="2qgKlT" id="6A9boVQyW2j" role="2OqNvi">
                    <ref role="37wK5l" to="6na6:6A9boVQy01o" resolve="resolveDependencies" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="nKS2y" id="6A9boVQyWGg" role="1MLUbF">
      <node concept="3clFbS" id="6A9boVQyWGh" role="2VODD2">
        <node concept="3clFbF" id="6A9boVQyWNC" role="3cqZAp">
          <node concept="2OqwBi" id="6A9boVQyWTI" role="3clFbG">
            <node concept="nLn13" id="6A9boVQyWNB" role="2Oq$k0" />
            <node concept="1mIQ4w" id="6A9boVQyXmJ" role="2OqNvi">
              <node concept="chp4Y" id="6A9boVQyXsl" role="cj9EA">
                <ref role="cht4Q" to="iuj9:5yyd2HFS3xA" resolve="NYoShAwareScript" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

