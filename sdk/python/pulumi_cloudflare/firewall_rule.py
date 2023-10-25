# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FirewallRuleArgs', 'FirewallRule']

@pulumi.input_type
class FirewallRuleArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 filter_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a FirewallRule resource.
        :param pulumi.Input[str] action: The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        :param pulumi.Input[str] filter_id: The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] description: A description of the rule to help identify it.
        :param pulumi.Input[bool] paused: Whether this filter based firewall rule is currently paused.
        :param pulumi.Input[int] priority: The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] products: List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        """
        FirewallRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action=action,
            filter_id=filter_id,
            zone_id=zone_id,
            description=description,
            paused=paused,
            priority=priority,
            products=products,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action: Optional[pulumi.Input[str]] = None,
             filter_id: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             paused: Optional[pulumi.Input[bool]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if action is None:
            raise TypeError("Missing 'action' argument")
        if filter_id is None and 'filterId' in kwargs:
            filter_id = kwargs['filterId']
        if filter_id is None:
            raise TypeError("Missing 'filter_id' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")

        _setter("action", action)
        _setter("filter_id", filter_id)
        _setter("zone_id", zone_id)
        if description is not None:
            _setter("description", description)
        if paused is not None:
            _setter("paused", paused)
        if priority is not None:
            _setter("priority", priority)
        if products is not None:
            _setter("products", products)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="filterId")
    def filter_id(self) -> pulumi.Input[str]:
        """
        The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        """
        return pulumi.get(self, "filter_id")

    @filter_id.setter
    def filter_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "filter_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the rule to help identify it.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this filter based firewall rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def products(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        """
        return pulumi.get(self, "products")

    @products.setter
    def products(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "products", value)


@pulumi.input_type
class _FirewallRuleState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 filter_id: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FirewallRule resources.
        :param pulumi.Input[str] action: The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        :param pulumi.Input[str] description: A description of the rule to help identify it.
        :param pulumi.Input[str] filter_id: The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        :param pulumi.Input[bool] paused: Whether this filter based firewall rule is currently paused.
        :param pulumi.Input[int] priority: The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] products: List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _FirewallRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            action=action,
            description=description,
            filter_id=filter_id,
            paused=paused,
            priority=priority,
            products=products,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             action: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             filter_id: Optional[pulumi.Input[str]] = None,
             paused: Optional[pulumi.Input[bool]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if filter_id is None and 'filterId' in kwargs:
            filter_id = kwargs['filterId']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if action is not None:
            _setter("action", action)
        if description is not None:
            _setter("description", description)
        if filter_id is not None:
            _setter("filter_id", filter_id)
        if paused is not None:
            _setter("paused", paused)
        if priority is not None:
            _setter("priority", priority)
        if products is not None:
            _setter("products", products)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the rule to help identify it.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="filterId")
    def filter_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        """
        return pulumi.get(self, "filter_id")

    @filter_id.setter
    def filter_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter_id", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this filter based firewall rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def products(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        """
        return pulumi.get(self, "products")

    @products.setter
    def products(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "products", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class FirewallRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 filter_id: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        wordpress_filter = cloudflare.Filter("wordpressFilter",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            description="Wordpress break-in attempts that are outside of the office",
            expression="(http.request.uri.path ~ \\".*wp-login.php\\" or http.request.uri.path ~ \\".*xmlrpc.php\\") and ip.src ne 192.0.2.1")
        wordpress_firewall_rule = cloudflare.FirewallRule("wordpressFirewallRule",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            description="Block wordpress break-in attempts",
            filter_id=wordpress_filter.id,
            action="block")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/firewallRule:FirewallRule example <zone_id>/<firewall_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        :param pulumi.Input[str] description: A description of the rule to help identify it.
        :param pulumi.Input[str] filter_id: The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        :param pulumi.Input[bool] paused: Whether this filter based firewall rule is currently paused.
        :param pulumi.Input[int] priority: The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] products: List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FirewallRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        wordpress_filter = cloudflare.Filter("wordpressFilter",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            description="Wordpress break-in attempts that are outside of the office",
            expression="(http.request.uri.path ~ \\".*wp-login.php\\" or http.request.uri.path ~ \\".*xmlrpc.php\\") and ip.src ne 192.0.2.1")
        wordpress_firewall_rule = cloudflare.FirewallRule("wordpressFirewallRule",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            description="Block wordpress break-in attempts",
            filter_id=wordpress_filter.id,
            action="block")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/firewallRule:FirewallRule example <zone_id>/<firewall_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param FirewallRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FirewallRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 filter_id: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallRuleArgs.__new__(FirewallRuleArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["description"] = description
            if filter_id is None and not opts.urn:
                raise TypeError("Missing required property 'filter_id'")
            __props__.__dict__["filter_id"] = filter_id
            __props__.__dict__["paused"] = paused
            __props__.__dict__["priority"] = priority
            __props__.__dict__["products"] = products
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(FirewallRule, __self__).__init__(
            'cloudflare:index/firewallRule:FirewallRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            filter_id: Optional[pulumi.Input[str]] = None,
            paused: Optional[pulumi.Input[bool]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            products: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'FirewallRule':
        """
        Get an existing FirewallRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        :param pulumi.Input[str] description: A description of the rule to help identify it.
        :param pulumi.Input[str] filter_id: The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        :param pulumi.Input[bool] paused: Whether this filter based firewall rule is currently paused.
        :param pulumi.Input[int] priority: The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] products: List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallRuleState.__new__(_FirewallRuleState)

        __props__.__dict__["action"] = action
        __props__.__dict__["description"] = description
        __props__.__dict__["filter_id"] = filter_id
        __props__.__dict__["paused"] = paused
        __props__.__dict__["priority"] = priority
        __props__.__dict__["products"] = products
        __props__.__dict__["zone_id"] = zone_id
        return FirewallRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the rule to help identify it.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="filterId")
    def filter_id(self) -> pulumi.Output[str]:
        """
        The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        """
        return pulumi.get(self, "filter_id")

    @property
    @pulumi.getter
    def paused(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether this filter based firewall rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def products(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
        """
        return pulumi.get(self, "products")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

