<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7f058b1e-dab4-4608-bf78-eceff5a66a56(cloud)">
  <persistence version="9" />
  <languages>
    <use id="f7196c5e-3839-47b2-a69a-cc57b10442a1" name="org.campagnelab.cloud" version="0" />
    <use id="c513c71c-d9f3-4625-83dc-6180e1012e68" name="org.campagnelab.cloud.configuration" version="0" />
    <use id="3b74e3b7-7336-414d-8899-64a293a44a07" name="org.campagnelab.docker.bash" version="0" />
  </languages>
  <imports>
    <import index="ili1" ref="r:0e890efb-eb84-45d5-b014-563cdc1d654b(org.campagnelab.docker.bash.run.plugin)" />
  </imports>
  <registry>
    <language id="f7196c5e-3839-47b2-a69a-cc57b10442a1" name="org.campagnelab.cloud">
      <concept id="6538561612137036945" name="org.campagnelab.cloud.structure.ContainerWithEC" flags="ng" index="3zOPYP">
        <property id="7017246219745809549" name="notes" index="1$193f" />
        <property id="9054962551105550959" name="credentials" index="1OHsCo" />
        <reference id="147628039490030680" name="dockerConfig" index="1QJbqN" />
        <child id="331977639697571264" name="container" index="234boB" />
        <child id="9054962551105352198" name="clusterConfig" index="1OGc9L" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="25281c03-4a7c-4b57-9221-24a10fc36ef5" name="org.campagnelab.docker">
      <concept id="8987412447079095297" name="org.campagnelab.docker.structure.Config" flags="ng" index="2EEQw1">
        <property id="8987412447080623507" name="options" index="2E$TAj" />
        <property id="8987412447079095298" name="pathToDocker" index="2EEQw2" />
      </concept>
      <concept id="1893262236499303418" name="org.campagnelab.docker.structure.ImageInfoForDockerContainer" flags="ng" index="VtuK3" />
      <concept id="1893262236499908796" name="org.campagnelab.docker.structure.DockerContainer" flags="ng" index="VuMX5">
        <property id="6819868375264208052" name="id" index="GbyUj" />
        <property id="1893262236499912677" name="tag" index="VuL0s" />
        <property id="1893262236499912678" name="userName" index="VuL0v" />
      </concept>
    </language>
    <language id="c513c71c-d9f3-4625-83dc-6180e1012e68" name="org.campagnelab.cloud.configuration">
      <concept id="6723914267405064973" name="org.campagnelab.cloud.configuration.structure.SSHFolder" flags="ng" index="2tz3XF">
        <property id="6723914267405064974" name="path" index="2tz3XC" />
      </concept>
      <concept id="3914476085377531388" name="org.campagnelab.cloud.configuration.structure.ClusterConfig" flags="ng" index="2KSRUY">
        <child id="3914476085377531437" name="options" index="2KSRPJ" />
      </concept>
      <concept id="7598045164870912447" name="org.campagnelab.cloud.configuration.structure.DiskSize" flags="ng" index="1mWehH">
        <property id="7598045164870912448" name="size" index="1mWegi" />
      </concept>
      <concept id="1155724070824382171" name="org.campagnelab.cloud.configuration.structure.ComputeNodeFlavor" flags="ng" index="1rOJCK">
        <property id="1155724070824382944" name="flavor" index="1rOIkb" />
      </concept>
      <concept id="6538561612137081194" name="org.campagnelab.cloud.configuration.structure.GridEngineClusterConfig" flags="ng" index="3zOwDe" />
      <concept id="6538561612137102278" name="org.campagnelab.cloud.configuration.structure.NodeClass" flags="ng" index="3zO_zy">
        <property id="6538561612137102279" name="numOfNodes" index="3zO_zz" />
      </concept>
      <concept id="6538561612137102282" name="org.campagnelab.cloud.configuration.structure.FrontendClass" flags="ng" index="3zO_zI" />
      <concept id="6538561612137102283" name="org.campagnelab.cloud.configuration.structure.ComputeClass" flags="ng" index="3zO_zJ" />
    </language>
  </registry>
  <node concept="2EEQw1" id="109XeHbQHGj">
    <property role="TrG5h" value="docker.config" />
    <property role="2EEQw2" value="/usr/local/bin/docker" />
    <property role="2E$TAj" value="--tlsverify --tlscacert=&quot;/Users/manuelesimi/.docker/machine/certs/ca.pem&quot; --tlscert=&quot;/Users/manuelesimi/.docker/machine/certs/cert.pem&quot; --tlskey=&quot;/Users/manuelesimi/.docker/machine/certs/key.pem&quot; -H=tcp://192.168.99.100:2376" />
  </node>
  <node concept="3zOPYP" id="109XeHbQHGh">
    <property role="TrG5h" value="ManageCloudCluster" />
    <property role="1$193f" value=" MPS project: MPS Project [NextflowWorkbench:35 modules] IDEA project: Project '/Users/mas2182/Lab/Projects/MPS/3.3/NextflowWorkbench' NextflowWorkbench PrefComponent: org.campagnelab.cloud.preferences.plugin.GridEngineCluster_PreferencesComponent@64299985 secret: rLBmNJiCSEfji5XbArdVnDxf project nextflow-workbench-test12 client 223877930626-4gt9mt9abcharqoaicnd05mq65bm8ne0.apps.googleusercontent.com" />
    <property role="1OHsCo" value="sh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDYNAAwMxzSZ8JW2UZVeqInh26FTMsrB1u5w+0vpn2L4d2SWQoX/B/fA/8JlQiqeijErw+4Y3KkxOO+DNXvnwMw1ShMGQWQ5+IRnhuPztVNVoHZ+2EiWaHkYfpDENxjN4pDxkCGsGrv9nWNFGXHpcUNlHBUxBRnT1X7oRcUgNMc2LeRkZvy3qsMaRcV5NEc77PT/S8InKsc570AmnqokJ+BxqtyqE9WU3Lt/KapDxR9pE5LsRIgD+McANbDmRCZnNBynrPghiN0DT+3LV2OtIQOpyHn2eDlT4WeGibmROnDf5VvfwKgJ9NaQhHOsos6sT4bpW4VanokDNI4Q3RxV2sH mas2182@mac133990.med.cornell.edu" />
    <ref role="1QJbqN" node="109XeHbQHGj" resolve="docker.config" />
    <node concept="VtuK3" id="109XeHbQHGi" role="234boB">
      <property role="VuL0s" value="latest" />
      <property role="VuL0v" value="artifacts" />
      <property role="GbyUj" value="elasticluster" />
    </node>
    <node concept="3zOwDe" id="109XeHbQHGk" role="1OGc9L">
      <property role="TrG5h" value="cluster.config" />
      <node concept="3zO_zI" id="109XeHbQHGl" role="2KSRPJ">
        <property role="TrG5h" value="Number of frontend nodes" />
        <property role="3zO_zz" value="1" />
      </node>
      <node concept="3zO_zJ" id="109XeHbQHGm" role="2KSRPJ">
        <property role="TrG5h" value="Number of worker nodes" />
        <property role="3zO_zz" value="2" />
      </node>
      <node concept="1mWehH" id="109XeHbQHGn" role="2KSRPJ">
        <property role="TrG5h" value="Disk size for worker nodes" />
        <property role="1mWegi" value="20" />
      </node>
      <node concept="2tz3XF" id="109XeHbQHGo" role="2KSRPJ">
        <property role="TrG5h" value="Folder with manager credentials" />
        <property role="2tz3XC" value="/Users/mas2182/.ssh" />
      </node>
    </node>
  </node>
  <node concept="3zOPYP" id="109XeHbQQvQ">
    <property role="TrG5h" value="ManageCloudCluster" />
    <ref role="1QJbqN" node="109XeHbQHGj" resolve="docker.config" />
    <node concept="VtuK3" id="109XeHbQQvR" role="234boB">
      <property role="VuL0s" value="latest" />
      <property role="VuL0v" value="artifacts" />
      <property role="GbyUj" value="elasticluster" />
    </node>
    <node concept="3zOwDe" id="109XeHbQQvS" role="1OGc9L">
      <property role="TrG5h" value="cluster.config" />
      <node concept="3zO_zI" id="109XeHbQQvT" role="2KSRPJ">
        <property role="TrG5h" value="Number of frontend nodes" />
        <property role="3zO_zz" value="1" />
      </node>
      <node concept="3zO_zJ" id="109XeHbQQvU" role="2KSRPJ">
        <property role="TrG5h" value="Number of worker nodes" />
        <property role="3zO_zz" value="2" />
      </node>
      <node concept="1mWehH" id="109XeHbQQvV" role="2KSRPJ">
        <property role="TrG5h" value="Disk size for worker nodes" />
        <property role="1mWegi" value="20" />
      </node>
      <node concept="2tz3XF" id="109XeHbQQvW" role="2KSRPJ">
        <property role="TrG5h" value="Folder with manager credentials" />
        <property role="2tz3XC" value="/Users/mas2182/.ssh" />
      </node>
    </node>
  </node>
  <node concept="3zOPYP" id="109XeHbR0wI">
    <property role="TrG5h" value="ManageCloudCluster" />
    <property role="1$193f" value=" MPS project: MPS Project [nextflowworkbench2:35 modules] IDEA project: Project '/Users/manuelesimi/Work/CampagneLab/Projects/MPS/3.3/nextflowworkbench2' NextflowWorkbench PrefComponent: org.campagnelab.cloud.preferences.plugin.GridEngineCluster_PreferencesComponent@7e5d1390 secret: rLBmNJiCSEfji5XbArdVnDxf project nextflow-workbench-test1 client 223877930626-4gt9mt9abcharqoaicnd05mq65bm8ne0.apps.googleusercontent.com" />
    <ref role="1QJbqN" node="109XeHbQHGj" resolve="docker.config" />
    <node concept="VtuK3" id="109XeHbR0wJ" role="234boB">
      <property role="VuL0s" value="latest" />
      <property role="VuL0v" value="artifacts" />
      <property role="GbyUj" value="elasticluster" />
    </node>
    <node concept="3zOwDe" id="109XeHbR0wK" role="1OGc9L">
      <property role="TrG5h" value="cluster.config" />
      <node concept="3zO_zI" id="109XeHbR0wL" role="2KSRPJ">
        <property role="TrG5h" value="Number of frontend nodes" />
        <property role="3zO_zz" value="1" />
      </node>
      <node concept="3zO_zJ" id="109XeHbR0wM" role="2KSRPJ">
        <property role="TrG5h" value="Number of worker nodes" />
        <property role="3zO_zz" value="2" />
      </node>
      <node concept="1rOJCK" id="109XeHbR0wN" role="2KSRPJ">
        <property role="TrG5h" value="Compute node type" />
        <property role="1rOIkb" value="n1-standard-2" />
      </node>
      <node concept="1mWehH" id="109XeHbR0wO" role="2KSRPJ">
        <property role="TrG5h" value="Disk size for worker nodes" />
        <property role="1mWegi" value="20" />
      </node>
      <node concept="2tz3XF" id="109XeHbR0wP" role="2KSRPJ">
        <property role="TrG5h" value="Folder with manager credentials" />
        <property role="2tz3XC" value="/Users/manuelesimi/.ssh" />
      </node>
    </node>
  </node>
</model>
