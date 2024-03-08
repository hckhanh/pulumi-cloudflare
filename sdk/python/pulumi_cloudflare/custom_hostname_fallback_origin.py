# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CustomHostnameFallbackOriginArgs', 'CustomHostnameFallbackOrigin']

@pulumi.input_type
class CustomHostnameFallbackOriginArgs:
    def __init__(__self__, *,
                 origin: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a CustomHostnameFallbackOrigin resource.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "origin", origin)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Input[str]:
        """
        Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[str]):
        pulumi.set(self, "origin", value)

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


@pulumi.input_type
class _CustomHostnameFallbackOriginState:
    def __init__(__self__, *,
                 origin: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomHostnameFallbackOrigin resources.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] status: Status of the fallback origin's activation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "origin", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the fallback origin's activation.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

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


class CustomHostnameFallbackOrigin(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare custom hostname fallback origin resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomHostnameFallbackOrigin("example",
            origin="fallback.example.com",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example <zone_id>/<fallback_hostname>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomHostnameFallbackOriginArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare custom hostname fallback origin resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomHostnameFallbackOrigin("example",
            origin="fallback.example.com",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example <zone_id>/<fallback_hostname>
        ```

        :param str resource_name: The name of the resource.
        :param CustomHostnameFallbackOriginArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomHostnameFallbackOriginArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 origin: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomHostnameFallbackOriginArgs.__new__(CustomHostnameFallbackOriginArgs)

            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["status"] = None
        super(CustomHostnameFallbackOrigin, __self__).__init__(
            'cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            origin: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CustomHostnameFallbackOrigin':
        """
        Get an existing CustomHostnameFallbackOrigin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] origin: Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        :param pulumi.Input[str] status: Status of the fallback origin's activation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomHostnameFallbackOriginState.__new__(_CustomHostnameFallbackOriginState)

        __props__.__dict__["origin"] = origin
        __props__.__dict__["status"] = status
        __props__.__dict__["zone_id"] = zone_id
        return CustomHostnameFallbackOrigin(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Output[str]:
        """
        Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the fallback origin's activation.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

