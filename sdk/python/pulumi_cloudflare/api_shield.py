# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ApiShieldArgs', 'ApiShield']

@pulumi.input_type
class ApiShieldArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]] = None):
        """
        The set of arguments for constructing a ApiShield resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]] auth_id_characteristics: Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        """
        ApiShieldArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            zone_id=zone_id,
            auth_id_characteristics=auth_id_characteristics,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             zone_id: pulumi.Input[str],
             auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("zone_id", zone_id)
        if auth_id_characteristics is not None:
            _setter("auth_id_characteristics", auth_id_characteristics)

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
    @pulumi.getter(name="authIdCharacteristics")
    def auth_id_characteristics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]]:
        """
        Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        """
        return pulumi.get(self, "auth_id_characteristics")

    @auth_id_characteristics.setter
    def auth_id_characteristics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]]):
        pulumi.set(self, "auth_id_characteristics", value)


@pulumi.input_type
class _ApiShieldState:
    def __init__(__self__, *,
                 auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiShield resources.
        :param pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]] auth_id_characteristics: Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _ApiShieldState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            auth_id_characteristics=auth_id_characteristics,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if auth_id_characteristics is not None:
            _setter("auth_id_characteristics", auth_id_characteristics)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="authIdCharacteristics")
    def auth_id_characteristics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]]:
        """
        Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        """
        return pulumi.get(self, "auth_id_characteristics")

    @auth_id_characteristics.setter
    def auth_id_characteristics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiShieldAuthIdCharacteristicArgs']]]]):
        pulumi.set(self, "auth_id_characteristics", value)

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


class ApiShield(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiShieldAuthIdCharacteristicArgs']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage API Shield configurations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ApiShield("example",
            auth_id_characteristics=[cloudflare.ApiShieldAuthIdCharacteristicArgs(
                name="my-example-header",
                type="header",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiShieldAuthIdCharacteristicArgs']]]] auth_id_characteristics: Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiShieldArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage API Shield configurations.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ApiShield("example",
            auth_id_characteristics=[cloudflare.ApiShieldAuthIdCharacteristicArgs(
                name="my-example-header",
                type="header",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        :param str resource_name: The name of the resource.
        :param ApiShieldArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiShieldArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ApiShieldArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiShieldAuthIdCharacteristicArgs']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiShieldArgs.__new__(ApiShieldArgs)

            __props__.__dict__["auth_id_characteristics"] = auth_id_characteristics
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(ApiShield, __self__).__init__(
            'cloudflare:index/apiShield:ApiShield',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auth_id_characteristics: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiShieldAuthIdCharacteristicArgs']]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ApiShield':
        """
        Get an existing ApiShield resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiShieldAuthIdCharacteristicArgs']]]] auth_id_characteristics: Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiShieldState.__new__(_ApiShieldState)

        __props__.__dict__["auth_id_characteristics"] = auth_id_characteristics
        __props__.__dict__["zone_id"] = zone_id
        return ApiShield(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authIdCharacteristics")
    def auth_id_characteristics(self) -> pulumi.Output[Optional[Sequence['outputs.ApiShieldAuthIdCharacteristic']]]:
        """
        Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        """
        return pulumi.get(self, "auth_id_characteristics")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

