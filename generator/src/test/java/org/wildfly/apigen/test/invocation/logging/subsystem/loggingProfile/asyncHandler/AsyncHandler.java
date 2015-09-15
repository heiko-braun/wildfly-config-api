package org.wildfly.apigen.test.invocation.logging.subsystem.loggingProfile.asyncHandler;

import org.wildfly.apigen.invocation.Address;
import org.wildfly.apigen.invocation.Binding;
import java.util.List;
/**
 * Defines a handler which writes to the sub-handlers in an asynchronous thread. Used for handlers which introduce a substantial amount of lag.
 */
@Address("/subsystem=logging/logging-profile=*/async-handler=*")
public class AsyncHandler {

	private String key;
	private Boolean enabled;
	private String filterSpec;
	private String level;
	private String name;
	private String overflowAction;
	private Integer queueLength;
	private List subhandlers;

	public AsyncHandler(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

	/**
	 * If set to true the handler is enabled and functioning as normal, if set to false the handler is ignored when processing log messages.
	 */
	@Binding(detypedName = "enabled")
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * If set to true the handler is enabled and functioning as normal, if set to false the handler is ignored when processing log messages.
	 */
	public AsyncHandler enabled(Boolean value) {
		this.enabled = value;
		return this;
	}

	/**
	 * A filter expression value to define a filter. Example for a filter that does not match a pattern: not(match("JBAS.*"))
	 */
	@Binding(detypedName = "filter-spec")
	public String filterSpec() {
		return this.filterSpec;
	}

	/**
	 * A filter expression value to define a filter. Example for a filter that does not match a pattern: not(match("JBAS.*"))
	 */
	public AsyncHandler filterSpec(String value) {
		this.filterSpec = value;
		return this;
	}

	/**
	 * The log level specifying which message levels will be logged by this handler. Message levels lower than this value will be discarded.
	 */
	@Binding(detypedName = "level")
	public String level() {
		return this.level;
	}

	/**
	 * The log level specifying which message levels will be logged by this handler. Message levels lower than this value will be discarded.
	 */
	public AsyncHandler level(String value) {
		this.level = value;
		return this;
	}

	/**
	 * The name of the handler.
	 */
	@Binding(detypedName = "name")
	public String name() {
		return this.name;
	}

	/**
	 * The name of the handler.
	 */
	public AsyncHandler name(String value) {
		this.name = value;
		return this;
	}

	/**
	 * Specify what action to take when the overflowing.  The valid options are 'block' and 'discard'
	 */
	@Binding(detypedName = "overflow-action")
	public String overflowAction() {
		return this.overflowAction;
	}

	/**
	 * Specify what action to take when the overflowing.  The valid options are 'block' and 'discard'
	 */
	public AsyncHandler overflowAction(String value) {
		this.overflowAction = value;
		return this;
	}

	/**
	 * The queue length to use before flushing writing
	 */
	@Binding(detypedName = "queue-length")
	public Integer queueLength() {
		return this.queueLength;
	}

	/**
	 * The queue length to use before flushing writing
	 */
	public AsyncHandler queueLength(Integer value) {
		this.queueLength = value;
		return this;
	}

	/**
	 * The Handlers associated with this async handler.
	 */
	@Binding(detypedName = "subhandlers")
	public List subhandlers() {
		return this.subhandlers;
	}

	/**
	 * The Handlers associated with this async handler.
	 */
	public AsyncHandler subhandlers(List value) {
		this.subhandlers = value;
		return this;
	}
}