/*
 * Copyright (c) 2013 University of Tartu
 */
package com.turn.jpmml.evaluator;

import java.util.*;

import org.dmg.pmml.*;

import com.turn.jpmml.evaluator.EvaluationContext;

public class LocalEvaluationContext extends EvaluationContext {

	public LocalEvaluationContext(){
		super(Collections.<FieldName, Object>emptyMap());
	}

	public LocalEvaluationContext(FieldName name, Object value){
		super(Collections.<FieldName, Object>singletonMap(name, value));
	}

	public LocalEvaluationContext(Map<FieldName, ?> parameters){
		super(parameters);
	}

	@Override
	public DerivedField resolve(FieldName name){
		return null;
	}
}