/*
 *  Copyright 2008 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mybatis.generator.codegen.ibatis2.dao;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.codegen.AbstractJavaClientGenerator;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.AbstractDAOElementGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.CountByParamsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.DeleteByParamsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.DeleteByPrimaryKeyMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.InsertMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.InsertSelectiveMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.SelectByParamsWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.SelectByParamsWithoutBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.SelectByPrimaryKeyMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByParamsParmsInnerclassGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByParamsSelectiveMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByParamsWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByParamsWithoutBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByPrimaryKeySelectiveMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByPrimaryKeyWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.elements.UpdateByPrimaryKeyWithoutBLOBsMethodGenerator;
import org.mybatis.generator.codegen.ibatis2.dao.templates.AbstractDAOTemplate;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.rules.Rules;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class DAOGenerator extends AbstractJavaClientGenerator {

	private AbstractDAOTemplate daoTemplate;
	private boolean generateForJava5;

	public DAOGenerator(AbstractDAOTemplate daoTemplate, boolean generateForJava5) {
		super(true);
		this.daoTemplate = daoTemplate;
		this.generateForJava5 = generateForJava5;
	}

	@Override
	public List<CompilationUnit> getCompilationUnits() {
		FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
		progressCallback.startTask(getString("Progress.14", table.toString())); //$NON-NLS-1$
		TopLevelClass topLevelClass = getTopLevelClassShell();
		Interface interfaze = getInterfaceShell();

		addCountByParamsMethod(topLevelClass, interfaze);
		addDeleteByParamsMethod(topLevelClass, interfaze);
		addDeleteByPrimaryKeyMethod(topLevelClass, interfaze);
		addInsertMethod(topLevelClass, interfaze);
		addInsertSelectiveMethod(topLevelClass, interfaze);
		addSelectByParamsWithBLOBsMethod(topLevelClass, interfaze);
		addSelectByParamsWithoutBLOBsMethod(topLevelClass, interfaze);
		addSelectByPrimaryKeyMethod(topLevelClass, interfaze);
		addUpdateByParamsParmsInnerclass(topLevelClass, interfaze);
		addUpdateByParamsSelectiveMethod(topLevelClass, interfaze);
		addUpdateByParamsWithBLOBsMethod(topLevelClass, interfaze);
		addUpdateByParamsWithoutBLOBsMethod(topLevelClass, interfaze);
		addUpdateByPrimaryKeySelectiveMethod(topLevelClass, interfaze);
		addUpdateByPrimaryKeyWithBLOBsMethod(topLevelClass, interfaze);
		addUpdateByPrimaryKeyWithoutBLOBsMethod(topLevelClass, interfaze);

		List<CompilationUnit> answer = new ArrayList<CompilationUnit>();
		if (context.getPlugins().clientGenerated(interfaze, topLevelClass, introspectedTable)) {
			answer.add(topLevelClass);
			answer.add(interfaze);
		}

		return answer;
	}

	protected TopLevelClass getTopLevelClassShell() {
		FullyQualifiedJavaType interfaceType = new FullyQualifiedJavaType(introspectedTable.getDAOInterfaceType());
		FullyQualifiedJavaType implementationType = new FullyQualifiedJavaType(
				introspectedTable.getDAOImplementationType());

		CommentGenerator commentGenerator = context.getCommentGenerator();

		TopLevelClass answer = new TopLevelClass(implementationType);
		answer.setVisibility(JavaVisibility.PUBLIC);
		answer.setSuperClass(daoTemplate.getSuperClass());
		answer.addImportedType(daoTemplate.getSuperClass());
		answer.addSuperInterface(interfaceType);
		answer.addImportedType(interfaceType);

		for (FullyQualifiedJavaType fqjt : daoTemplate.getImplementationImports()) {
			answer.addImportedType(fqjt);
		}

		commentGenerator.addJavaFileComment(answer);

		// add constructor from the template
		answer.addMethod(daoTemplate.getConstructorClone(commentGenerator, implementationType, introspectedTable));

		// add any fields from the template
		for (Field field : daoTemplate.getFieldClones(commentGenerator, introspectedTable)) {
			answer.addField(field);
		}

		// add any methods from the template
		for (Method method : daoTemplate.getMethodClones(commentGenerator, introspectedTable)) {
			answer.addMethod(method);
		}

		return answer;
	}

	protected Interface getInterfaceShell() {
		Interface answer = new Interface(new FullyQualifiedJavaType(introspectedTable.getDAOInterfaceType()));
		answer.setVisibility(JavaVisibility.PUBLIC);

		String rootInterface = introspectedTable.getTableConfigurationProperty(PropertyRegistry.ANY_ROOT_INTERFACE);
		if (!stringHasValue(rootInterface)) {
			rootInterface = context.getJavaClientGeneratorConfiguration().getProperty(
					PropertyRegistry.ANY_ROOT_INTERFACE);
		}

		if (stringHasValue(rootInterface)) {
			FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(rootInterface);
			answer.addSuperInterface(fqjt);
			answer.addImportedType(fqjt);
		}

		for (FullyQualifiedJavaType fqjt : daoTemplate.getInterfaceImports()) {
			answer.addImportedType(fqjt);
		}

		context.getCommentGenerator().addJavaFileComment(answer);

		return answer;
	}

	protected void addCountByParamsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateCountByParams()) {
			AbstractDAOElementGenerator methodGenerator = new CountByParamsMethodGenerator(generateForJava5);
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addDeleteByParamsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateDeleteByParams()) {
			AbstractDAOElementGenerator methodGenerator = new DeleteByParamsMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addDeleteByPrimaryKeyMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateDeleteByPrimaryKey()) {
			AbstractDAOElementGenerator methodGenerator = new DeleteByPrimaryKeyMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addInsertMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateInsert()) {
			AbstractDAOElementGenerator methodGenerator = new InsertMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addInsertSelectiveMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateInsertSelective()) {
			AbstractDAOElementGenerator methodGenerator = new InsertSelectiveMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addSelectByParamsWithBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateSelectByParamsWithBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new SelectByParamsWithBLOBsMethodGenerator(generateForJava5);
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addSelectByParamsWithoutBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateSelectByParamsWithoutBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new SelectByParamsWithoutBLOBsMethodGenerator(
					generateForJava5);
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addSelectByPrimaryKeyMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
			AbstractDAOElementGenerator methodGenerator = new SelectByPrimaryKeyMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByParamsParmsInnerclass(TopLevelClass topLevelClass, Interface interfaze) {
		Rules rules = introspectedTable.getRules();
		if (rules.generateUpdateByParamsSelective() || rules.generateUpdateByParamsWithBLOBs()
				|| rules.generateUpdateByParamsWithoutBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByParamsParmsInnerclassGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByParamsSelectiveMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByParamsSelective()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByParamsSelectiveMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByParamsWithBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByParamsWithBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByParamsWithBLOBsMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByParamsWithoutBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByParamsWithoutBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByParamsWithoutBLOBsMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByPrimaryKeySelectiveMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByPrimaryKeySelectiveMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByPrimaryKeyWithBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByPrimaryKeyWithBLOBsMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void addUpdateByPrimaryKeyWithoutBLOBsMethod(TopLevelClass topLevelClass, Interface interfaze) {
		if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithoutBLOBs()) {
			AbstractDAOElementGenerator methodGenerator = new UpdateByPrimaryKeyWithoutBLOBsMethodGenerator();
			initializeAndExecuteGenerator(methodGenerator, topLevelClass, interfaze);
		}
	}

	protected void initializeAndExecuteGenerator(AbstractDAOElementGenerator methodGenerator,
			TopLevelClass topLevelClass, Interface interfaze) {
		methodGenerator.setDAOTemplate(daoTemplate);
		methodGenerator.setContext(context);
		methodGenerator.setIntrospectedTable(introspectedTable);
		methodGenerator.setProgressCallback(progressCallback);
		methodGenerator.setWarnings(warnings);
		methodGenerator.addImplementationElements(topLevelClass);
		methodGenerator.addInterfaceElements(interfaze);
	}

	@Override
	public AbstractXmlGenerator getMatchedXMLGenerator() {
		// this method is not called for iBATIS2
		return null;
	}
}