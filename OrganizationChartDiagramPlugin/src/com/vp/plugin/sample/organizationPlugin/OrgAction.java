package com.vp.plugin.sample.organizationPlugin;

import java.awt.Color;
import java.awt.Point;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.DiagramManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.diagram.IDiagramTypeConstants;
import com.vp.plugin.diagram.IDiagramUIModel;
import com.vp.plugin.diagram.shape.IOCUnitUIModel;
import com.vp.plugin.model.IOCLine;
import com.vp.plugin.model.IOCUnit;
import com.vp.plugin.model.factory.IModelElementFactory;

public class OrgAction implements VPActionController{

	@Override
	public void performAction(VPAction arg0) {
		//Create Blank Diagram
		DiagramManager diagramManager = ApplicationManager.instance().getDiagramManager();
		IDiagramUIModel org = (IDiagramUIModel) diagramManager.createDiagram(IDiagramTypeConstants.DIAGRAM_TYPE_ORGANIZATION_CHART);
		org.setName("Simple Organization Chart");
		
		//Create Unit
		IOCUnit projectManager = IModelElementFactory.instance().createOCUnit();
		projectManager.setName("Project Manager");
		IOCUnitUIModel shapeProjectManager = (IOCUnitUIModel) diagramManager.createDiagramElement(org, projectManager);
		shapeProjectManager.setBounds(400, 50, 150, 50);
		shapeProjectManager.resetCaption();
		
		IOCUnit  deptProjectManager = IModelElementFactory.instance().createOCUnit();
		deptProjectManager.setName("Deputy Project Manager");
		IOCUnitUIModel shapeDeptProjectManager = (IOCUnitUIModel) diagramManager.createDiagramElement(org, deptProjectManager);
		shapeDeptProjectManager.setBounds(400, 150, 150, 50);
		shapeDeptProjectManager.resetCaption();
		
		IOCUnit systemEng = IModelElementFactory.instance().createOCUnit();
		systemEng.setName("System Engineering");
		IOCUnitUIModel shapeSystemEng = (IOCUnitUIModel) diagramManager.createDiagramElement(org, systemEng);
		shapeSystemEng.setBounds(50, 250, 150, 50);
		//Set up the color for the unit(Optional)
		shapeSystemEng.getFillColor().setColor1(new Color(128, 128, 255));
		shapeSystemEng.resetCaption();
		
		IOCUnit indTestGp = IModelElementFactory.instance().createOCUnit();
		indTestGp.setName("Independent Test Group");
		IOCUnitUIModel shapeIndTestGp = (IOCUnitUIModel) diagramManager.createDiagramElement(org, indTestGp);
		shapeIndTestGp.setBounds(225, 250, 150, 50);
		shapeIndTestGp.getFillColor().setColor1(new Color(255,128,128));
		shapeIndTestGp.resetCaption();
		
		IOCUnit proTechLead = IModelElementFactory.instance().createOCUnit();
		proTechLead.setName("Peoject Technical Lead");
		IOCUnitUIModel shapeProTechlead = (IOCUnitUIModel) diagramManager.createDiagramElement(org, proTechLead);
		shapeProTechlead.setBounds(400, 250, 150, 50);
		shapeProTechlead.getFillColor().setColor1(new Color(255,160,60));
		shapeProTechlead.resetCaption();
		
		IOCUnit qualAssur = IModelElementFactory.instance().createOCUnit();
		qualAssur.setName("Quality Assurance");
		IOCUnitUIModel shapeQualAssur = (IOCUnitUIModel) diagramManager.createDiagramElement(org, qualAssur);
		shapeQualAssur.setBounds(575, 250, 150, 50);
		shapeQualAssur.getFillColor().setColor1(new Color(255,128,255));
		shapeQualAssur.resetCaption();
		
		IOCUnit configMan = IModelElementFactory.instance().createOCUnit();
		configMan.setName("Configuration Management");
		IOCUnitUIModel shapeConfigMan = (IOCUnitUIModel) diagramManager.createDiagramElement(org, configMan);
		shapeConfigMan.setBounds(750, 250, 150, 50);
		shapeConfigMan.getFillColor().setColor1(new Color(192,192,255));
		shapeConfigMan.resetCaption();
		
		IOCUnit subMan1 = IModelElementFactory.instance().createOCUnit();
		subMan1.setName("S/W Subproject Manager 1");
		IOCUnitUIModel shapeSubMan1 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, subMan1);
		shapeSubMan1.setBounds(100, 350, 150, 50);
		shapeSubMan1.getFillColor().setColor1(new Color(255,192,192));
		shapeSubMan1.resetCaption();
		
		IOCUnit subMan2 = IModelElementFactory.instance().createOCUnit();
		subMan2.setName("S/W Subproject Manager 2");
		IOCUnitUIModel shapeSubMan2 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, subMan2);
		shapeSubMan2.setBounds(400, 350, 150, 50);
		shapeSubMan2.getFillColor().setColor1(new Color(128,255,128));
		shapeSubMan2.resetCaption();
		
		IOCUnit subMan3 = IModelElementFactory.instance().createOCUnit();
		subMan3.setName("S/W Subproject Manager 3");
		IOCUnitUIModel shapeSubMan3 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, subMan3);
		shapeSubMan3.setBounds(700, 350, 150, 50);
		shapeSubMan3.getFillColor().setColor1(new Color(255,255,128));
		shapeSubMan3.resetCaption();
		
		IOCUnit sM1Team1 = IModelElementFactory.instance().createOCUnit();
		sM1Team1.setName("Team 1");
		IOCUnitUIModel shapeSM1T1 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM1Team1);
		shapeSM1T1.setBounds(60, 450, 60, 50);
		shapeSM1T1.getFillColor().setColor1(new Color(255,192,192));
		shapeSM1T1.resetCaption();
		
		IOCUnit sM1Team2 = IModelElementFactory.instance().createOCUnit();
		sM1Team2.setName("Team 2");
		IOCUnitUIModel shapeSM1T2 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM1Team2);
		shapeSM1T2.setBounds(145, 450, 60, 50);
		shapeSM1T2.getFillColor().setColor1(new Color(255,192,192));
		shapeSM1T2.resetCaption();
		
		IOCUnit sM1Team3 = IModelElementFactory.instance().createOCUnit();
		sM1Team3.setName("Team 3");
		IOCUnitUIModel shapeSM1T3 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM1Team3);
		shapeSM1T3.setBounds(230, 450, 60, 50);
		shapeSM1T3.getFillColor().setColor1(new Color(255,192,192));
		shapeSM1T3.resetCaption();
		
		IOCUnit sM2Team1 = IModelElementFactory.instance().createOCUnit();
		sM2Team1.setName("Team 1");
		IOCUnitUIModel shapeSM2T1 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM2Team1);
		shapeSM2T1.setBounds(400, 450, 60, 50);
		shapeSM2T1.getFillColor().setColor1(new Color(128,255,128));
		shapeSM2T1.resetCaption();
		
		IOCUnit sM2Team2 = IModelElementFactory.instance().createOCUnit();
		sM2Team2.setName("Team 2");
		IOCUnitUIModel shapeSM2T2 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM2Team2);
		shapeSM2T2.setBounds(490, 450, 60, 50);
		shapeSM2T2.getFillColor().setColor1(new Color(128,255,128));
		shapeSM2T2.resetCaption();
		
		IOCUnit sM3Team1 = IModelElementFactory.instance().createOCUnit();
		sM3Team1.setName("Team 1");
		IOCUnitUIModel shapeSM3T1 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM3Team1);
		shapeSM3T1.setBounds(700, 450, 60, 50);
		shapeSM3T1.getFillColor().setColor1(new Color(255,255,128));
		shapeSM3T1.resetCaption();
		
		IOCUnit sM3Team2 = IModelElementFactory.instance().createOCUnit();
		sM3Team2.setName("Team 2");
		IOCUnitUIModel shapeSM3T2 = (IOCUnitUIModel) diagramManager.createDiagramElement(org, sM3Team2);
		shapeSM3T2.setBounds(790, 450, 60, 50);
		shapeSM3T2.getFillColor().setColor1(new Color(255,255,128));
		shapeSM3T2.resetCaption();
		
		//create Connector
		IOCLine proManToDeptMan = IModelElementFactory.instance().createOCLine();
		proManToDeptMan.setFrom(projectManager);
		proManToDeptMan.setTo(deptProjectManager);
		diagramManager.createConnector(org, proManToDeptMan, shapeProjectManager, shapeDeptProjectManager, new Point[] {});
		
		IOCLine deptManToSysEng = IModelElementFactory.instance().createOCLine();
		deptManToSysEng.setFrom(deptProjectManager);
		deptManToSysEng.setTo(systemEng);
		diagramManager.createConnector(org, deptManToSysEng, shapeDeptProjectManager, shapeSystemEng, new Point[] {new Point(475,200), new Point(475,225), new Point(125,225), new Point(125,250)});
		
		IOCLine deptManToIndTestGp = IModelElementFactory.instance().createOCLine();
		deptManToIndTestGp.setFrom(deptProjectManager);
		deptManToIndTestGp.setTo(indTestGp);
		diagramManager.createConnector(org, deptManToIndTestGp, shapeDeptProjectManager, shapeIndTestGp, new Point[] {new Point(475,200), new Point(475,225), new Point(300,225), new Point(300,250)});
		
		IOCLine deptManToProTechLead = IModelElementFactory.instance().createOCLine();
		deptManToProTechLead.setFrom(deptProjectManager);
		deptManToProTechLead.setTo(proTechLead);
		diagramManager.createConnector(org, deptManToProTechLead, shapeDeptProjectManager, shapeProTechlead, new Point[] {});
		
		IOCLine deptManToQualAssu = IModelElementFactory.instance().createOCLine();
		deptManToQualAssu.setFrom(deptProjectManager);
		deptManToQualAssu.setTo(qualAssur);
		diagramManager.createConnector(org, deptManToQualAssu, shapeDeptProjectManager, shapeQualAssur, new Point[] {new Point(475,200), new Point(475, 225), new Point(650,225), new Point(650,250)});
		
		IOCLine deptManToConfigMan = IModelElementFactory.instance().createOCLine();
		deptManToConfigMan.setFrom(deptProjectManager);
		deptManToConfigMan.setTo(configMan);
		diagramManager.createConnector(org, deptManToConfigMan, shapeDeptProjectManager, shapeConfigMan, new Point[] {new Point(475,200), new Point(475,225), new Point(825,225), new Point(825,250)});
		
		IOCLine proTechLeadToSM1 = IModelElementFactory.instance().createOCLine();
		proTechLeadToSM1.setFrom(proTechLead);
		proTechLeadToSM1.setTo(subMan1);
		diagramManager.createConnector(org, proTechLeadToSM1, shapeProTechlead, shapeSubMan1, new Point[] {new Point(475,300), new Point(475,325), new Point(175,325), new Point(175,350)});
		
		IOCLine proTechLeadToSM2 = IModelElementFactory.instance().createOCLine();
		proTechLeadToSM2.setFrom(proTechLead);
		proTechLeadToSM2.setTo(subMan2);
		diagramManager.createConnector(org, proTechLeadToSM2, shapeProTechlead, shapeSubMan2, new Point[] {});
		
		IOCLine proTechLeadToSM3 = IModelElementFactory.instance().createOCLine();
		proTechLeadToSM3.setFrom(proTechLead);
		proTechLeadToSM3.setTo(subMan3);
		diagramManager.createConnector(org, proTechLeadToSM3, shapeProTechlead, shapeSubMan3, new Point[] {new Point(475,300), new Point(475,325), new Point(775,325), new Point(775,350)});
		
		IOCLine sM1ToTeam1 = IModelElementFactory.instance().createOCLine();
		sM1ToTeam1.setFrom(subMan1);
		sM1ToTeam1.setTo(sM1Team1);
		diagramManager.createConnector(org, sM1ToTeam1, shapeSubMan1, shapeSM1T1, new Point[] {new Point(175,400), new Point(175,425), new Point(90,425), new Point(90,450)});
		
		IOCLine sM1ToTeam2 = IModelElementFactory.instance().createOCLine();
		sM1ToTeam2.setFrom(subMan1);
		sM1ToTeam2.setTo(sM1Team2);
		diagramManager.createConnector(org, sM1ToTeam2, shapeSubMan1, shapeSM1T2, new Point[] {});
		
		IOCLine sM1ToTeam3 = IModelElementFactory.instance().createOCLine();
		sM1ToTeam3.setFrom(subMan1);
		sM1ToTeam3.setTo(sM1Team3);
		diagramManager.createConnector(org, sM1ToTeam3, shapeSubMan1, shapeSM1T3, new Point[] {new Point(175,400), new Point(175,425), new Point(260,425), new Point(260,450)});
		
		IOCLine sM2ToTeam1 = IModelElementFactory.instance().createOCLine();
		sM2ToTeam1.setFrom(subMan2);
		sM2ToTeam1.setTo(sM2Team1);
		diagramManager.createConnector(org, sM2ToTeam1, shapeSubMan2, shapeSM2T1, new Point[] {new Point(475,400), new Point(475,425), new Point(430,425), new Point(430,450)});
		
		IOCLine sM2ToTeam2 = IModelElementFactory.instance().createOCLine();
		sM2ToTeam2.setFrom(subMan2);
		sM2ToTeam2.setTo(sM2Team2);
		diagramManager.createConnector(org, sM2ToTeam2, shapeSubMan2, shapeSM2T2, new Point[] {new Point(475,400), new Point(475,425), new Point(520,425), new Point(520,450)});
		
		IOCLine sM3ToTeam1 = IModelElementFactory.instance().createOCLine();
		sM3ToTeam1.setFrom(subMan3);
		sM3ToTeam1.setTo(sM3Team1);
		diagramManager.createConnector(org, sM3ToTeam1, shapeSubMan3, shapeSM3T1, new Point[] {new Point(775,400), new Point(775,425), new Point(730,425), new Point(730,450)});
		
		IOCLine sM3ToTeam2 = IModelElementFactory.instance().createOCLine();
		sM3ToTeam2.setFrom(subMan3);
		sM3ToTeam2.setTo(sM3Team2);
		diagramManager.createConnector(org, sM3ToTeam1, shapeSubMan3, shapeSM3T2, new Point[] {new Point(775,400), new Point(775,425), new Point(820,425), new Point(820,450)});
		
		
		//show up diagram
		diagramManager.openDiagram(org);
		
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}

}
