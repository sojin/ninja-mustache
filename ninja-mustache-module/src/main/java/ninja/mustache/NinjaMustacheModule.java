/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ninja.mustache;

import ninja.mustache.template.TemplateEngineMustache;
import ninja.template.TemplateEngine;

import com.github.mustachejava.DeferringMustacheFactory;
import com.github.mustachejava.MustacheFactory;
import com.google.inject.AbstractModule;

/**
 * 
 * Bindings for Rythm template engine
 * 
 * @author sojin, kpacha
 * 
 */
public class NinjaMustacheModule extends AbstractModule {
    @Override
    protected void configure() {
	bind(MustacheFactory.class).to(DeferringMustacheFactory.class);
	bind(TemplateEngine.class).to(TemplateEngineMustache.class);
    }
}
