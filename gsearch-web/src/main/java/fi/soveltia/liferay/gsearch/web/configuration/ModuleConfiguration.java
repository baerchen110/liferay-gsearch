
package fi.soveltia.liferay.gsearch.web.configuration;

import aQute.bnd.annotation.metatype.Meta;

/**
 * GSearch Web module configuration.
 * 
 * @author Petteri Karttunen
 *
 */
@Meta.OCD(
	id = "fi.soveltia.liferay.gsearch.mini.web.configuration.GSearchPortlet",
	localization = "content/Language",
	name = "GSearch Portlet"
)
public interface ModuleConfiguration {

	@Meta.AD(
		deflt = "false", 
		description = "enable-js-debug-desc",
	    name = "enable-js-debug-name",
		required = false
	)
	public boolean jsDebuggingEnabled();	

	@Meta.AD(
		deflt = "3", 
	    name = "keywords-min-length",
		required = false
	)
	public int queryMinLength();
	
	@Meta.AD(
		deflt = "true", 
	    name = "enable-autocompletion-name",
	    description = "enable-autocompletion-desc",
		required = false
	)
	public boolean enableAutoComplete();

	@Meta.AD(
		deflt = "150", 
	    description = "autocomplete-delay-desc",
	    name = "autocomplete-delay-name",
		required = false
	)
	public int autoCompleteRequestDelay();	

	@Meta.AD(
		deflt = "10000", 
		description = "request-timeout-desc",
	    name = "request-timeout-name",
		required = false
	)
	public int requestTimeout();

	@Meta.AD(
		deflt = "", 
		description = "helptext-article-id-desc",
	    name = "helptext-article-id-name",
		required = false
	)
	public String helpTextArticleId();
	
	@Meta.AD(
		deflt = "0", 
		description = "helptext-group-id-desc",
	    name = "helptext-group-id-name",
		required = false
	)
	public long helpTextGroupId();
	
	@Meta.AD(
		deflt = "true", 
	    description = "show-tags-desc",
	    name = "show-tags-name",
		required = false
	)
	public boolean showTags();
}

