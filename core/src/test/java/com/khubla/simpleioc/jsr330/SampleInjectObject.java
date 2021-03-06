package com.khubla.simpleioc.jsr330;

/**
 * Copyright 2012 Tom Everett Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
import javax.inject.Inject;
import javax.inject.Named;

import com.khubla.simpleioc.annotation.RegistryBean;

/**
 * @author tome
 */
@RegistryBean(name = "sampleInjectObject")
public class SampleInjectObject {
   @Inject()
   private SampleInjectedInterface sampleInjectedObject;
   @Inject()
   @Named("sampleInjectedObject")
   private SampleInjectedInterface interface2;

   public SampleInjectedInterface getInterface2() {
      return interface2;
   }

   public SampleInjectedInterface getSampleInjectedObject() {
      return sampleInjectedObject;
   }

   public void setInterface2(SampleInjectedInterface interface2) {
      this.interface2 = interface2;
   }

   public void setSampleInjectedObject(SampleInjectedInterface sampleInjectedObject) {
      this.sampleInjectedObject = sampleInjectedObject;
   }
}
