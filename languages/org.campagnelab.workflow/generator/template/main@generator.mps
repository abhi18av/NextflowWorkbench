<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:cb87f197-eced-45b8-a1de-862778a14545(org.campagnelab.workflow.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="-1" />
    <use id="c6c823fb-a9da-46e7-9850-129b0f7a7aa5" name="org.campagnelab.workflow" version="-1" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="-1" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="-1" />
    <use id="92d2ea16-5a42-4fdf-a676-c7604efe3504" name="de.slisson.mps.richtext" version="-1" />
    <use id="ed6d7656-532c-4bc2-81d1-af945aeb8280" name="jetbrains.mps.baseLanguage.blTypes" version="-1" />
    <use id="9ded098b-ad6a-4657-bfd9-48636cfe8bc3" name="jetbrains.mps.lang.traceable" version="-1" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="-1" />
    <use id="479c7a8c-02f9-43b5-9139-d910cb22f298" name="jetbrains.mps.core.xml" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="iuxj" ref="r:64db3a92-5968-4a73-b456-34504a2d97a6(jetbrains.mps.core.xml.structure)" />
    <import index="iowz" ref="r:0583c0e9-dc14-4152-95a4-93036dce931b(org.campagnelab.workflow.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
    </language>
    <language id="479c7a8c-02f9-43b5-9139-d910cb22f298" name="jetbrains.mps.core.xml">
      <concept id="6666499814681515200" name="jetbrains.mps.core.xml.structure.XmlFile" flags="ng" index="2pMbU2">
        <child id="6666499814681515201" name="document" index="2pMbU3" />
      </concept>
      <concept id="6666499814681541919" name="jetbrains.mps.core.xml.structure.XmlTextValue" flags="ng" index="2pMdtt">
        <property id="6666499814681541920" name="text" index="2pMdty" />
      </concept>
      <concept id="6666499814681415858" name="jetbrains.mps.core.xml.structure.XmlElement" flags="ng" index="2pNNFK">
        <property id="6666499814681415862" name="tagName" index="2pNNFO" />
        <property id="6999033275467544021" name="shortEmptyNotation" index="qg3DV" />
        <child id="6666499814681415861" name="attributes" index="2pNNFR" />
        <child id="1622293396948928802" name="content" index="3o6s8t" />
      </concept>
      <concept id="6666499814681447923" name="jetbrains.mps.core.xml.structure.XmlAttribute" flags="ng" index="2pNUuL">
        <property id="6666499814681447926" name="attrName" index="2pNUuO" />
        <child id="6666499814681541918" name="value" index="2pMdts" />
      </concept>
      <concept id="1622293396948952339" name="jetbrains.mps.core.xml.structure.XmlText" flags="nn" index="3o6iSG" />
      <concept id="6786756355279841993" name="jetbrains.mps.core.xml.structure.XmlDocument" flags="ng" index="3rIKKV">
        <child id="6666499814681299055" name="rootElement" index="2pNm8H" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <property id="1177959072138" name="keepSourceRoot" index="13Pg2o" />
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="propertyName" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2pMbU2" id="2cffJJS8DVj">
    <property role="TrG5h" value="run-remote" />
    <property role="3GE5qa" value="" />
    <node concept="3rIKKV" id="2cffJJS8DVk" role="2pMbU3">
      <node concept="2pNNFK" id="2cffJJS8Eiq" role="2pNm8H">
        <property role="2pNNFO" value="project" />
        <node concept="2pNUuL" id="2cffJJS8EiY" role="2pNNFR">
          <property role="2pNUuO" value="name" />
          <node concept="2pMdtt" id="2cffJJS8Ejj" role="2pMdts">
            <property role="2pMdty" value="nextflow-remote" />
          </node>
        </node>
        <node concept="2pNUuL" id="2cffJJS8Ejp" role="2pNNFR">
          <property role="2pNUuO" value="default" />
          <node concept="2pMdtt" id="2cffJJS8Ejw" role="2pMdts">
            <property role="2pMdty" value="submit" />
          </node>
        </node>
        <node concept="2pNNFK" id="3LlDVJS4O6t" role="3o6s8t">
          <property role="2pNNFO" value="dirname" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="3LlDVJS4Ocr" role="2pNNFR">
            <property role="2pNUuO" value="property" />
            <node concept="2pMdtt" id="3LlDVJS4Oe7" role="2pMdts">
              <property role="2pMdty" value="nextflow-remote.basedir" />
            </node>
          </node>
          <node concept="2pNUuL" id="3LlDVJS4OfT" role="2pNNFR">
            <property role="2pNUuO" value="file" />
            <node concept="2pMdtt" id="3LlDVJS4OhH" role="2pMdts">
              <property role="2pMdty" value="${ant.file.nextflow-remote}" />
            </node>
          </node>
        </node>
        <node concept="2pNNFK" id="2cffJJS8Eiw" role="3o6s8t">
          <property role="2pNNFO" value="property" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="2cffJJS8EjV" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$jW" role="2pMdts">
              <property role="2pMdty" value="source.dir" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp$k6" role="2pNNFR">
            <property role="2pNUuO" value="location" />
            <node concept="2pMdtt" id="5OPtsPp$kJ" role="2pMdts">
              <property role="2pMdty" value="${nextflow-remote.basedir}" />
            </node>
          </node>
        </node>
        <node concept="2pNNFK" id="5OPtsPp$l7" role="3o6s8t">
          <property role="2pNNFO" value="property" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="5OPtsPp$l8" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$l9" role="2pMdts">
              <property role="2pMdty" value="remote.job.dir" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp$la" role="2pNNFR">
            <property role="2pNUuO" value="location" />
            <node concept="2pMdtt" id="5OPtsPp$lb" role="2pMdts">
              <property role="2pMdty" value="remote.job.dir" />
              <node concept="17Uvod" id="3LlDVJS4Olf" role="lGtFl">
                <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                <property role="2qtEX9" value="text" />
                <node concept="3zFVjK" id="3LlDVJS4Olg" role="3zH0cK">
                  <node concept="3clFbS" id="3LlDVJS4Olh" role="2VODD2">
                    <node concept="3clFbF" id="3LlDVJS4OtJ" role="3cqZAp">
                      <node concept="2OqwBi" id="3LlDVJS4P1_" role="3clFbG">
                        <node concept="2OqwBi" id="3LlDVJS4Oya" role="2Oq$k0">
                          <node concept="30H73N" id="3LlDVJS4OtI" role="2Oq$k0" />
                          <node concept="3TrEf2" id="3LlDVJS4OND" role="2OqNvi">
                            <ref role="3Tt5mk" to="iowz:5OPtsQdNPR" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="3LlDVJS4Piq" role="2OqNvi">
                          <ref role="3TsBF5" to="iowz:5OPtsPGn$r" resolve="value" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2pNNFK" id="5OPtsPp$mH" role="3o6s8t">
          <property role="2pNNFO" value="property" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="5OPtsPp$mI" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$mJ" role="2pMdts">
              <property role="2pMdty" value="remote.username" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp$mK" role="2pNNFR">
            <property role="2pNUuO" value="value" />
            <node concept="2pMdtt" id="5OPtsPp$mL" role="2pMdts">
              <property role="2pMdty" value="remote.username" />
              <node concept="17Uvod" id="3LlDVJS4PoU" role="lGtFl">
                <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                <property role="2qtEX9" value="text" />
                <node concept="3zFVjK" id="3LlDVJS4PoV" role="3zH0cK">
                  <node concept="3clFbS" id="3LlDVJS4PoW" role="2VODD2">
                    <node concept="3clFbF" id="3LlDVJS4Pu5" role="3cqZAp">
                      <node concept="2OqwBi" id="3LlDVJS4PYS" role="3clFbG">
                        <node concept="2OqwBi" id="3LlDVJS4Pyw" role="2Oq$k0">
                          <node concept="30H73N" id="3LlDVJS4Pu4" role="2Oq$k0" />
                          <node concept="3TrEf2" id="3LlDVJS4PKW" role="2OqNvi">
                            <ref role="3Tt5mk" to="iowz:5OPtsPGnXu" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="3LlDVJS4Qn8" role="2OqNvi">
                          <ref role="3TsBF5" to="iowz:5OPtsPGn$r" resolve="value" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2pNNFK" id="3LlDVJS4Skx" role="3o6s8t">
          <property role="2pNNFO" value="property" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="3LlDVJS4SyQ" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="3LlDVJS4SyU" role="2pMdts">
              <property role="2pMdty" value="submission.machine" />
            </node>
          </node>
          <node concept="2pNUuL" id="3LlDVJS4Sz2" role="2pNNFR">
            <property role="2pNUuO" value="value" />
            <node concept="2pMdtt" id="3LlDVJS4Szc" role="2pMdts">
              <property role="2pMdty" value="submission.machine" />
              <node concept="17Uvod" id="3LlDVJS4Szg" role="lGtFl">
                <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                <property role="2qtEX9" value="text" />
                <node concept="3zFVjK" id="3LlDVJS4Szh" role="3zH0cK">
                  <node concept="3clFbS" id="3LlDVJS4Szi" role="2VODD2">
                    <node concept="3clFbF" id="3LlDVJS4SA0" role="3cqZAp">
                      <node concept="2OqwBi" id="3LlDVJS4T4m" role="3clFbG">
                        <node concept="2OqwBi" id="3LlDVJS4SEr" role="2Oq$k0">
                          <node concept="30H73N" id="3LlDVJS4S_Z" role="2Oq$k0" />
                          <node concept="3TrEf2" id="3LlDVJS4SQq" role="2OqNvi">
                            <ref role="3Tt5mk" to="iowz:5OPtsPGnXr" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="3LlDVJS4TK6" role="2OqNvi">
                          <ref role="3TsBF5" to="iowz:5OPtsPGn$r" resolve="value" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2pNNFK" id="5OPtsPp$nx" role="3o6s8t">
          <property role="2pNNFO" value="property" />
          <property role="qg3DV" value="true" />
          <node concept="2pNUuL" id="5OPtsPp$ny" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$nz" role="2pMdts">
              <property role="2pMdty" value="keyfile" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp$n$" role="2pNNFR">
            <property role="2pNUuO" value="location" />
            <node concept="2pMdtt" id="5OPtsPp$n_" role="2pMdts">
              <property role="2pMdty" value="keyfile" />
              <node concept="17Uvod" id="3LlDVJS4QtC" role="lGtFl">
                <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                <property role="2qtEX9" value="text" />
                <node concept="3zFVjK" id="3LlDVJS4QtD" role="3zH0cK">
                  <node concept="3clFbS" id="3LlDVJS4QtE" role="2VODD2">
                    <node concept="3clFbF" id="3LlDVJS4QyN" role="3cqZAp">
                      <node concept="2OqwBi" id="3LlDVJS4R6A" role="3clFbG">
                        <node concept="2OqwBi" id="3LlDVJS4QBe" role="2Oq$k0">
                          <node concept="30H73N" id="3LlDVJS4QyM" role="2Oq$k0" />
                          <node concept="3TrEf2" id="3LlDVJS4QPE" role="2OqNvi">
                            <ref role="3Tt5mk" to="iowz:5OPtsQdObC" />
                          </node>
                        </node>
                        <node concept="3TrcHB" id="3LlDVJS4RZL" role="2OqNvi">
                          <ref role="3TsBF5" to="iowz:5OPtsPGn$r" resolve="value" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3o6iSG" id="5OPtsPp$58" role="3o6s8t" />
        <node concept="2pNNFK" id="5OPtsPp$vZ" role="3o6s8t">
          <property role="2pNNFO" value="target" />
          <node concept="2pNUuL" id="5OPtsPp$y_" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$zt" role="2pMdts">
              <property role="2pMdty" value="create-job-dir" />
            </node>
          </node>
          <node concept="2pNNFK" id="5OPtsPp$$v" role="3o6s8t">
            <property role="2pNNFO" value="sshexec" />
            <property role="qg3DV" value="true" />
            <node concept="2pNUuL" id="5OPtsPp$AM" role="2pNNFR">
              <property role="2pNUuO" value="host" />
              <node concept="2pMdtt" id="5OPtsPp$BG" role="2pMdts">
                <property role="2pMdty" value="${submission.machine}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp$CF" role="2pNNFR">
              <property role="2pNUuO" value="username" />
              <node concept="2pMdtt" id="5OPtsPp$DF" role="2pMdts">
                <property role="2pMdty" value="${remote.username}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp$EG" role="2pNNFR">
              <property role="2pNUuO" value="keyfile" />
              <node concept="2pMdtt" id="5OPtsPp$FM" role="2pMdts">
                <property role="2pMdty" value="${keyfile}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp$GP" role="2pNNFR">
              <property role="2pNUuO" value="command" />
              <node concept="2pMdtt" id="5OPtsPp$I1" role="2pMdts">
                <property role="2pMdty" value="mkdir -p ${remote.job.dir}" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3o6iSG" id="5OPtsPp$I4" role="3o6s8t" />
        <node concept="2pNNFK" id="5OPtsPp$Kg" role="3o6s8t">
          <property role="2pNNFO" value="target" />
          <node concept="2pNUuL" id="5OPtsPp$Mq" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp$Nu" role="2pMdts">
              <property role="2pMdty" value="copy-files" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp$PC" role="2pNNFR">
            <property role="2pNUuO" value="depends" />
            <node concept="2pMdtt" id="5OPtsPp$PK" role="2pMdts">
              <property role="2pMdty" value="create-job-dir" />
            </node>
          </node>
          <node concept="2pNNFK" id="5OPtsPp$QR" role="3o6s8t">
            <property role="2pNNFO" value="scp" />
            <node concept="2pNUuL" id="5OPtsPp$S2" role="2pNNFR">
              <property role="2pNUuO" value="todir" />
              <node concept="2pMdtt" id="5OPtsPp$Tb" role="2pMdts">
                <property role="2pMdty" value="${remote.username}@${submission.machine}:${remote.job.dir}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp$Up" role="2pNNFR">
              <property role="2pNUuO" value="keyfile" />
              <node concept="2pMdtt" id="5OPtsPp$VC" role="2pMdts">
                <property role="2pMdty" value="${keyfile}" />
              </node>
            </node>
            <node concept="2pNNFK" id="5OPtsPp$VF" role="3o6s8t">
              <property role="2pNNFO" value="fileset" />
              <property role="qg3DV" value="true" />
              <node concept="2pNUuL" id="5OPtsPp$WV" role="2pNNFR">
                <property role="2pNUuO" value="dir" />
                <node concept="2pMdtt" id="5OPtsPp$Y9" role="2pMdts">
                  <property role="2pMdty" value="${source.dir}" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3o6iSG" id="5OPtsPp$Yd" role="3o6s8t" />
        <node concept="2pNNFK" id="5OPtsPp_1h" role="3o6s8t">
          <property role="2pNNFO" value="target" />
          <node concept="2pNUuL" id="5OPtsPp_2R" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp_49" role="2pMdts">
              <property role="2pMdty" value="grant-permissions" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp_4f" role="2pNNFR">
            <property role="2pNUuO" value="depends" />
            <node concept="2pMdtt" id="5OPtsPp_5C" role="2pMdts">
              <property role="2pMdty" value="copy-files" />
            </node>
          </node>
          <node concept="2pNNFK" id="5OPtsPp_6X" role="3o6s8t">
            <property role="2pNNFO" value="sshexec" />
            <property role="qg3DV" value="true" />
            <node concept="2pNUuL" id="5OPtsPp_a6" role="2pNNFR">
              <property role="2pNUuO" value="host" />
              <node concept="2pMdtt" id="5OPtsPp_aa" role="2pMdts">
                <property role="2pMdty" value="${submission.machine}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_bA" role="2pNNFR">
              <property role="2pNUuO" value="username" />
              <node concept="2pMdtt" id="5OPtsPp_bI" role="2pMdts">
                <property role="2pMdty" value="${remote.username}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_bO" role="2pNNFR">
              <property role="2pNUuO" value="keyfile" />
              <node concept="2pMdtt" id="5OPtsPp_c0" role="2pMdts">
                <property role="2pMdty" value="${keyfile}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_dw" role="2pNNFR">
              <property role="2pNUuO" value="command" />
              <node concept="2pMdtt" id="5OPtsPp_fa" role="2pMdts">
                <property role="2pMdty" value="chmod a+x ${remote.job.dir}/runNextflow" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3o6iSG" id="5OPtsPp_70" role="3o6s8t" />
        <node concept="2pNNFK" id="5OPtsPp_he" role="3o6s8t">
          <property role="2pNNFO" value="target" />
          <node concept="2pNUuL" id="5OPtsPp_ji" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp_kN" role="2pMdts">
              <property role="2pMdty" value="submit" />
            </node>
          </node>
          <node concept="2pNUuL" id="5OPtsPp_kT" role="2pNNFR">
            <property role="2pNUuO" value="depends" />
            <node concept="2pMdtt" id="5OPtsPp_mx" role="2pMdts">
              <property role="2pMdty" value="copy-files, grant-permissions" />
            </node>
          </node>
          <node concept="2pNNFK" id="5OPtsPp_m_" role="3o6s8t">
            <property role="2pNNFO" value="sshexec" />
            <property role="qg3DV" value="true" />
            <node concept="2pNUuL" id="5OPtsPp_mG" role="2pNNFR">
              <property role="2pNUuO" value="host" />
              <node concept="2pMdtt" id="5OPtsPp_oi" role="2pMdts">
                <property role="2pMdty" value="${submission.machine}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_oF" role="2pNNFR">
              <property role="2pNUuO" value="username" />
              <node concept="2pMdtt" id="5OPtsPp_oG" role="2pMdts">
                <property role="2pMdty" value="${remote.username}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_oH" role="2pNNFR">
              <property role="2pNUuO" value="keyfile" />
              <node concept="2pMdtt" id="5OPtsPp_oI" role="2pMdts">
                <property role="2pMdty" value="${keyfile}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_p0" role="2pNNFR">
              <property role="2pNUuO" value="command" />
              <node concept="2pMdtt" id="5OPtsPp_sx" role="2pMdts">
                <property role="2pMdty" value="cd ${remote.job.dir}; ./runNextflow ${remote.job.dir}/Workflow" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3o6iSG" id="5OPtsPp_s_" role="3o6s8t" />
        <node concept="2pNNFK" id="5OPtsPp_xx" role="3o6s8t">
          <property role="2pNNFO" value="target" />
          <node concept="2pNUuL" id="5OPtsPp_$3" role="2pNNFR">
            <property role="2pNUuO" value="name" />
            <node concept="2pMdtt" id="5OPtsPp_$6" role="2pMdts">
              <property role="2pMdty" value="clean" />
            </node>
          </node>
          <node concept="2pNNFK" id="5OPtsPp_AI" role="3o6s8t">
            <property role="2pNNFO" value="sshexec" />
            <property role="qg3DV" value="true" />
            <node concept="2pNUuL" id="5OPtsPp_AJ" role="2pNNFR">
              <property role="2pNUuO" value="host" />
              <node concept="2pMdtt" id="5OPtsPp_AK" role="2pMdts">
                <property role="2pMdty" value="${submission.machine}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_AL" role="2pNNFR">
              <property role="2pNUuO" value="username" />
              <node concept="2pMdtt" id="5OPtsPp_AM" role="2pMdts">
                <property role="2pMdty" value="${remote.username}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_AN" role="2pNNFR">
              <property role="2pNUuO" value="keyfile" />
              <node concept="2pMdtt" id="5OPtsPp_AO" role="2pMdts">
                <property role="2pMdty" value="${keyfile}" />
              </node>
            </node>
            <node concept="2pNUuL" id="5OPtsPp_AP" role="2pNNFR">
              <property role="2pNUuO" value="command" />
              <node concept="2pMdtt" id="5OPtsPp_AQ" role="2pMdts">
                <property role="2pMdty" value="rm -rf ${remote.dir}" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="n94m4" id="2cffJJS8DVm" role="lGtFl">
      <ref role="n9lRv" to="iowz:5OPtsPGg59" resolve="RemoteSubmissionConfig" />
    </node>
  </node>
  <node concept="bUwia" id="2cffJJS7wDx">
    <property role="TrG5h" value="main" />
    <property role="3GE5qa" value="" />
    <node concept="3lhOvk" id="2cffJJS7$6E" role="3lj3bC">
      <property role="13Pg2o" value="true" />
      <ref role="3lhOvi" node="2cffJJS8DVj" resolve="run-remote" />
      <ref role="30HIoZ" to="iowz:5OPtsPGg59" resolve="RemoteSubmissionConfig" />
    </node>
  </node>
</model>
