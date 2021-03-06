/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.controllers.gwt.support;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;

public final class Gamepad extends JavaScriptObject {
	
	protected Gamepad() {
		// Required by GWT
	}
	
	public native String getId() /*-{
		return this.id; 
	}-*/;

	public native int getIndex() /*-{
		return this.index;
	}-*/;

	public native boolean getConnected() /*-{
		return this.conected;
	}-*/;

	public native double getTimestamp() /*-{
		return this.timestamp; 
	}-*/;

	public native String getMapping() /*-{
		return this.mapping;
	}-*/;

	public native JsArrayNumber getAxes() /*-{
		return this.axes;
	}-*/;
	
	public native JsArray<GamepadButton> getButtons() /*-{
		return this.buttons;
	}-*/;

	public native double getPreviousTimestamp() /*-{
		return this.previousTimestamp;
	}-*/;

	public native void setPreviousTimestamp(double previousTimestamp) /*-{
		this.previousTimestamp = previousTimestamp;
	}-*/;

	public native boolean canVibrate() /*-{
		return (this.vibrationActuator);
	}-*/;

	public native void doVibrate(int duration, float strength) /*-{
	    if (this.vibrationActuator) {
			this.vibrationActuator.playEffect("dual-rumble", {
			  startDelay: 0,
			  duration: duration,
			  weakMagnitude: strength,
			  strongMagnitude: strength
			});
		}
	}-*/;

	public static Gamepad getGamepad(int index) {
		return GamepadSupport.getGamepad(index);		
	}

}