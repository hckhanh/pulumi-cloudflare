# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RegionalHostnameArgs', 'RegionalHostname']

@pulumi.input_type
class RegionalHostnameArgs:
    def __init__(__self__, *,
                 hostname: pulumi.Input[str],
                 region_key: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a RegionalHostname resource.
        :param pulumi.Input[str] hostname: The hostname to regionalize.
        :param pulumi.Input[str] region_key: The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        RegionalHostnameArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            hostname=hostname,
            region_key=region_key,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             hostname: Optional[pulumi.Input[str]] = None,
             region_key: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if hostname is None:
            raise TypeError("Missing 'hostname' argument")
        if region_key is None and 'regionKey' in kwargs:
            region_key = kwargs['regionKey']
        if region_key is None:
            raise TypeError("Missing 'region_key' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")

        _setter("hostname", hostname)
        _setter("region_key", region_key)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Input[str]:
        """
        The hostname to regionalize.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: pulumi.Input[str]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="regionKey")
    def region_key(self) -> pulumi.Input[str]:
        """
        The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        """
        return pulumi.get(self, "region_key")

    @region_key.setter
    def region_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "region_key", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _RegionalHostnameState:
    def __init__(__self__, *,
                 created_on: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 region_key: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RegionalHostname resources.
        :param pulumi.Input[str] created_on: The RFC3339 timestamp of when the hostname was created.
        :param pulumi.Input[str] hostname: The hostname to regionalize.
        :param pulumi.Input[str] region_key: The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        _RegionalHostnameState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            created_on=created_on,
            hostname=hostname,
            region_key=region_key,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             created_on: Optional[pulumi.Input[str]] = None,
             hostname: Optional[pulumi.Input[str]] = None,
             region_key: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if created_on is None and 'createdOn' in kwargs:
            created_on = kwargs['createdOn']
        if region_key is None and 'regionKey' in kwargs:
            region_key = kwargs['regionKey']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if created_on is not None:
            _setter("created_on", created_on)
        if hostname is not None:
            _setter("hostname", hostname)
        if region_key is not None:
            _setter("region_key", region_key)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[str]]:
        """
        The RFC3339 timestamp of when the hostname was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_on", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        The hostname to regionalize.
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="regionKey")
    def region_key(self) -> Optional[pulumi.Input[str]]:
        """
        The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        """
        return pulumi.get(self, "region_key")

    @region_key.setter
    def region_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_key", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class RegionalHostname(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 region_key: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Data Localization Suite Regional Hostname.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Regionalized hostname record resources are managed independently from the
        # Regionalized Hostname resources.
        example_record = cloudflare.Record("exampleRecord",
            name="example.com",
            ttl=3600,
            type="A",
            value="192.0.2.1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        # The cloudflare_regional_hostname resource may exist with or without its
        # corresponding record resource.
        example_regional_hostname = cloudflare.RegionalHostname("exampleRegionalHostname",
            hostname="example.com",
            region_key="eu",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: The hostname to regionalize.
        :param pulumi.Input[str] region_key: The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RegionalHostnameArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Data Localization Suite Regional Hostname.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Regionalized hostname record resources are managed independently from the
        # Regionalized Hostname resources.
        example_record = cloudflare.Record("exampleRecord",
            name="example.com",
            ttl=3600,
            type="A",
            value="192.0.2.1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        # The cloudflare_regional_hostname resource may exist with or without its
        # corresponding record resource.
        example_regional_hostname = cloudflare.RegionalHostname("exampleRegionalHostname",
            hostname="example.com",
            region_key="eu",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param RegionalHostnameArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegionalHostnameArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RegionalHostnameArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 region_key: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegionalHostnameArgs.__new__(RegionalHostnameArgs)

            if hostname is None and not opts.urn:
                raise TypeError("Missing required property 'hostname'")
            __props__.__dict__["hostname"] = hostname
            if region_key is None and not opts.urn:
                raise TypeError("Missing required property 'region_key'")
            __props__.__dict__["region_key"] = region_key
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["created_on"] = None
        super(RegionalHostname, __self__).__init__(
            'cloudflare:index/regionalHostname:RegionalHostname',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_on: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            region_key: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'RegionalHostname':
        """
        Get an existing RegionalHostname resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_on: The RFC3339 timestamp of when the hostname was created.
        :param pulumi.Input[str] hostname: The hostname to regionalize.
        :param pulumi.Input[str] region_key: The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegionalHostnameState.__new__(_RegionalHostnameState)

        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["region_key"] = region_key
        __props__.__dict__["zone_id"] = zone_id
        return RegionalHostname(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[str]:
        """
        The RFC3339 timestamp of when the hostname was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        The hostname to regionalize.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="regionKey")
    def region_key(self) -> pulumi.Output[str]:
        """
        The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
        """
        return pulumi.get(self, "region_key")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

